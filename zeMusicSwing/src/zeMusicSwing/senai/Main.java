package zeMusicSwing.senai;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws Exception {
		//casting
		//cast
		//boxing
		//unboxing
		//Generics x Object
		//  (Object) nome;
		// <T>

		 String artista;
		 Integer op;
		 ArrayList<String> listaArtista =  new ArrayList<>();
		       
	       do{
	    	  artista = JOptionPane.showInputDialog("Digite o nome do artista"); 
		      listaArtista.add(artista);                   
		      op = Integer.parseInt(JOptionPane.showInputDialog("Encerrar:-1 Continuar:1"));
		      	if(op.getClass().getSimpleName().equals("Integer")){
		      continue;
		      	} else {
		      JOptionPane.showMessageDialog(null,"Valor Inválido");
		       break;
		        }
		     }while(op != -1);
		        //primeira forma
		        JOptionPane.showMessageDialog(null,listaArtista.toString());
		   
		       //observações
		       //fique atento ao generics <  >
		       //fique atento ao pacote java.util.* ele é o cara
		       //outra forma de percorrer uma Collection
		       for (String itemArtista: listaArtista) {
		           JOptionPane.showMessageDialog(null,itemArtista.toUpperCase());;           
		       }
		       listaArtista.forEach(item->{
		           JOptionPane.showMessageDialog(null,"percorrendo da terceiro");
		           JOptionPane.showMessageDialog(null,item);
		        });
		
		        JOptionPane.showMessageDialog(null,"Total:"+listaArtista.size());
		        
		        ArrayList<Integer> lista = new ArrayList<>();
		        lista.add(30);
		        lista.add(20);
		        lista.add(10);

		        Integer somaTotalGaloes = lista.stream().mapToInt(Integer::intValue).sum();
		        JOptionPane.showMessageDialog(null,somaTotalGaloes.toString());
		        Double totalLitros =somaTotalGaloes*3.7854;
		        JOptionPane.showMessageDialog(null,totalLitros);
		        

		    }
		}
