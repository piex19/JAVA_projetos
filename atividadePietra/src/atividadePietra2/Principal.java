package atividadePietra2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String p1;	
		
	Scanner leitura = new Scanner(System.in);
	TrabalhadorChefe tchefe = new TrabalhadorChefe("Vinicius", "Vasconcelos", 8500);
	TrabalhadorComissao tc = new TrabalhadorComissao("Sofia", "Medeiros", 2000, 0.5, 5);
	TrabalhadorProducao tp = new TrabalhadorProducao("Marcos", "Soares", 50, 1000);
	TrabalhadorHorista th = new TrabalhadorHorista("Carlos", "Pereira", 50, 5);
			
		p1 = "DIGITE SEU CARGO: " 
					+ "\n1- Trabalhador Chefe." 
					+ "\n2- Trabalhador por Comissão." 
					+ "\n3- Trabalhador por Produção." 
					+ "\n4- Trabalhador Horista.";
			System.out.println(p1);
			p1 = leitura.next();
			
		switch(p1) {
		case "1":
			System.out.println(tchefe.toString());
			break;
		case "2":
			System.out.println(tc.toString());
			break;
		case "3":
			System.out.println(tp.toString());
			break;
		case "4":
			System.out.println(th.toString());
			break;
		}
		leitura.close();
	}

}
