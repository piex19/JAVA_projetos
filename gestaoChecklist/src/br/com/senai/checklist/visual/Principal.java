package br.com.senai.checklist.visual;
//Toda classe come�a com aletra Ma�uscula
import javax.swing.JOptionPane;


public class Principal {
	//Public - todo mundo v� e acessar 
	//Private - somente a classe acessa 
	//Protected - permito o acesso para outra classse acessa
	

	//Encapsulamneto 
	

	//O que � classe?
	//A classe � um conjunto de objetos.
	/*
	 * No pacote inserimos classes 
	 * E as classes representam objetos
	 * 
	 * Exemplo:
	 * 
	 * Quais objetos pertecem a classe Mam�fero
	 * 
	 *  -Morcego
	 *  -Baleia
	 *  -Onitorrinco
	 *  -Le�o 
	 *  -Ser humano 
	 *  
	 *  Um objeto � um elmento da classe ?
	 *
	 *Termo tecnico?:
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Checklist1.0");
		// Regra para declarar uma vari�vel no Java
		// Primeiro - t�tulo
		// Segunda - nome da variavel
		// Terceiro - ;
		// Java � fortemente tipado
		
		//Definindo ferramenta Id=1
		String ferramenta1;
		int id1 = 1;
		ferramenta1 = "stackoverflow";
		JOptionPane.showMessageDialog(null, "ID: " + id1 + " " + "Ferramenta: " + ferramenta1);

		String ferramenta2;
		int id2 = 2;
		ferramenta2 = "github";
		JOptionPane.showMessageDialog(null, "ID: " + id2 + " " + "Ferramenta: " + ferramenta2);
		
		String ferramenta3;
		int id3 = 3;
		ferramenta3 = "git";
		JOptionPane.showMessageDialog(null, "ID: " + id3 + " " + "Ferramenta: " + ferramenta3);
		
		String ferramenta4;
		int id4 = 4;
		ferramenta4 = "eclipse";
		JOptionPane.showMessageDialog(null, "ID: " + id4 + " " + "Ferramenta: " + ferramenta4);
		
		String ferramenta5;
		int id5 = 5;
		ferramenta5 = "excel";
		JOptionPane.showMessageDialog(null, "ID: " + id5 + " " + "Ferramenta: " + ferramenta5);
		
		String ferramenta6;
		int id6 = 6;
		ferramenta6 = "word";
		JOptionPane.showMessageDialog(null, "ID: " + id6 + " " + "Ferramenta: " + ferramenta6);
		
		String ferramenta7;
		int id7 = 7;
		ferramenta7 = "powerpoint";
		JOptionPane.showMessageDialog(null, "ID: " + id7 + " " + "Ferramenta: " + ferramenta7);
		
		String ferramenta8;
		int id8 = 8;
		ferramenta8 = "visualg";
		JOptionPane.showMessageDialog(null, "ID: " + id8 + " " + "Ferramenta: " + ferramenta8);
		
		String ferramenta9;
		int id9 = 9;
		ferramenta9 = "rachacuca";
		JOptionPane.showMessageDialog(null, "ID: " + id9 + " " + "Ferramenta: " + ferramenta9);
		
		String ferramenta10;
		int id10 = 10;
		ferramenta10 = "codekata";
		JOptionPane.showMessageDialog(null, "ID: " + id10 + " " + "Ferramenta: " + ferramenta10);
		
		String ferramenta11;
		int id11 = 11;
		ferramenta11 = "javadoc";
		JOptionPane.showMessageDialog(null, "ID: " + id11 + " " + "Ferramenta: " + ferramenta11);
		
		String ferramenta12;
		int id12 = 12;
		ferramenta12 = "vscode";
		JOptionPane.showMessageDialog(null, "ID: " + id12 + " " + "Ferramenta: " + ferramenta12);
		
		String ferramenta13;
		int id13 = 13;
		ferramenta13 = "mysql";
		JOptionPane.showMessageDialog(null, "ID: " + id13 + " " + "Ferramenta: " + ferramenta13);
		
		String ferramenta14;
		int id14 = 14;
		ferramenta14 = "mysql workbench";
		JOptionPane.showMessageDialog(null, "ID: " + id14 + " " + "Ferramenta: " + ferramenta14);
		
		String ferramenta15;
		int id15 = 15;
		ferramenta15 = "spring";
		JOptionPane.showMessageDialog(null, "ID: " + id15 + " " + "Ferramenta: " + ferramenta15);
		
		String ferramenta16;
		int id16 = 16;
		ferramenta16 = "open handset alliance";
		JOptionPane.showMessageDialog(null, "ID: " + id16 + " " + "Ferramenta: " + ferramenta16);
		
		String ferramenta17;
		int id17 = 17;
		ferramenta17 = "html5test";
		JOptionPane.showMessageDialog(null, "ID: " + id17 + " " + "Ferramenta: " + ferramenta17);
		
		String ferramenta18;
		int id18 = 18;
		ferramenta18 = "w3schools";
		JOptionPane.showMessageDialog(null, "ID: " + id18 + " " + "Ferramenta: " + ferramenta18);
		
		String ferramenta19;
		int id19 = 19;
		ferramenta19 = "dinossauro do css";
		JOptionPane.showMessageDialog(null, "ID: " + id19 + " " + "Ferramenta: " + ferramenta19);
		
		String ferramenta20;
		int id20 = 20;
		ferramenta20 = "livros maujor";
		JOptionPane.showMessageDialog(null, "ID: " + id20 + " " + "Ferramenta: " + ferramenta20);
		
		String ferramenta21;
		int id21 = 21;
		ferramenta21 = "w3c validator";
		JOptionPane.showMessageDialog(null, "ID: " + id21 + " " + "Ferramenta: " + ferramenta21);
		
		String ferramenta22;
		int id22 = 22;
		ferramenta22 = "microsoft learn";
		JOptionPane.showMessageDialog(null, "ID: " + id22 + " " + "Ferramenta: " + ferramenta22);
		
		
		
		// Variavel - colocando -        entrada de dados(digitar)
		String usuario = JOptionPane.showInputDialog("Qual o usu�rio do sistema?");
		// mostrando
		JOptionPane.showMessageDialog(null, usuario);
		
		String f1;
		f1 = JOptionPane.showInputDialog("Qual � o nome da 1� ferramenta?");
		if(f1.equalsIgnoreCase("stackoverflow")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Que pena! Vamos para a pr�xima pergunta.");
		}
		
		
		String f2;
		f2 = JOptionPane.showInputDialog("Qual � o nome da 2� ferramenta?");
		if(f2.equalsIgnoreCase("github")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Que pena! Vamos para a pr�xima pergunta.");
		}
		
		
		String f3;
		f3 = JOptionPane.showInputDialog("Qual � o nome da 3� ferramenta?");
		if(f3.equalsIgnoreCase("git")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Que pena! Vamos para a pr�xima pergunta.");
		}
		
		
		String f4;
		f4 = JOptionPane.showInputDialog("Qual � o nome da 4� ferramenta?");
		if(f4.equalsIgnoreCase("eclipse")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Que pena! Vamos para a pr�xima pergunta.");
		}
		
		
		String f5;
		f5 = JOptionPane.showInputDialog("Qual � o nome da 5� ferramenta?");
		if(f5.equalsIgnoreCase("excel")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Que pena! Vamos para a pr�xima pergunta.");
		}
		
		
		String f6;
		f6 = JOptionPane.showInputDialog("Qual � o nome da 6� ferramenta?");
		if(f6.equalsIgnoreCase("word")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Que pena! Vamos para a pr�xima pergunta.");
		}
		
		
		String f7;
		f7 = JOptionPane.showInputDialog("Qual � o nome da 7� ferramenta?");
		if(f7.equalsIgnoreCase("powerpoint")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Que pena! Vamos para a pr�xima pergunta.");
		}
		
		
		String f8;
		f8 = JOptionPane.showInputDialog("Qual � o nome da 8� ferramenta?");
		if(f8.equalsIgnoreCase("visualg")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Que pena! Vamos para a pr�xima pergunta.");
		}
		
		
		String f9;
		f9 = JOptionPane.showInputDialog("Qual � o nome da 9� ferramenta?");
		if(f9.equalsIgnoreCase("rachacuca")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Que pena! Vamos para a pr�xima pergunta.");
		}
		
		
		String f10;
		f10 = JOptionPane.showInputDialog("Qual � o nome da 10� ferramenta?");
		if(f10.equalsIgnoreCase("codekata")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Que pena! Vamos para a pr�xima pergunta.");
		}
		
		
		String f11;
		f11 = JOptionPane.showInputDialog("Qual � o nome da 11� ferramenta?");
		if(f11.equalsIgnoreCase("javadoc")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Que pena! Vamos para a pr�xima pergunta.");
		}
		
		
		String f12;
		f12 = JOptionPane.showInputDialog("Qual � o nome da 12� ferramenta?");
		if(f12.equalsIgnoreCase("vscode")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Que pena! Vamos para a pr�xima pergunta.");
		}
		
		
		String f13;
		f13 = JOptionPane.showInputDialog("Qual � o nome da 13� ferramenta?");
		if(f13.equalsIgnoreCase("mysql")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Que pena! Vamos para a pr�xima pergunta.");
		}
		
		
		String f14;
		f14 = JOptionPane.showInputDialog("Qual � o nome da 14� ferramenta?");
		if(f14.equalsIgnoreCase("mysql workbench")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Que pena! Vamos para a pr�xima pergunta.");
		}
		
		
		String f15;
		f15 = JOptionPane.showInputDialog("Qual � o nome da 15� ferramenta?");
		if(f15.equalsIgnoreCase("spring")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Que pena! Vamos para a pr�xima pergunta.");
		}
		
		
		String f16;
		f16 = JOptionPane.showInputDialog("Qual � o nome da 16� ferramenta?");
		if(f16.equalsIgnoreCase("open handset alliance")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Que pena! Vamos para a pr�xima pergunta.");
		}
		
		
		String f17;
		f17 = JOptionPane.showInputDialog("Qual � o nome da 17� ferramenta?");
		if(f17.equalsIgnoreCase("html5test")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Que pena! Vamos para a pr�xima pergunta.");
		}
		
		
		String f18;
		f18 = JOptionPane.showInputDialog("Qual � o nome da 18� ferramenta?");
		if(f18.equalsIgnoreCase("w3schools")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Que pena! Vamos para a pr�xima pergunta.");
		}
		
		
		String f19;
		f19 = JOptionPane.showInputDialog("Qual � o nome da 19� ferramenta?");
		if(f19.equalsIgnoreCase("dinossauro do css")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Que pena! Vamos para a pr�xima pergunta.");
		}
		
		
		String f20;
		f20 = JOptionPane.showInputDialog("Qual � o nome da 20� ferramenta?");
		if(f20.equalsIgnoreCase("livros maujor")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Que pena! Vamos para a pr�xima pergunta.");
		}
		
		
		String f21;
		f21 = JOptionPane.showInputDialog("Qual � o nome da 21� ferramenta?");
		if(f21.equalsIgnoreCase("w3c validator")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Que pena! Vamos para a pr�xima pergunta.");
		}
		
		
		String f22;
		f22 = JOptionPane.showInputDialog("Qual � o nome da 22� ferramenta?");
		if(f22.equalsIgnoreCase("microsoft learn")) {
			JOptionPane.showMessageDialog(null, "Parab�ns, voc� acertou!");
		} else {
			JOptionPane.showMessageDialog(null, "Que pena! Vamos para a pr�xima pergunta.");
		}
		
		
		
		
		
		
		
		
	}

}
