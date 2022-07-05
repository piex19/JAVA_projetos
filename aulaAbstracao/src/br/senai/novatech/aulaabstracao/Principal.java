package br.senai.novatech.aulaabstracao;

import java.util.Scanner;

public class Principal {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner scanner = new Scanner(System.in)) {
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		ContaRural cr = new ContaRural();
		
		String p1;
		String p2;
		String p3;
		String p4;
		String p5;
		
		do {
			p1 = "Digite para acessar:\n1-Conta Corrente.\n2-Conta Poupança.\n3-Conta Rural";
			p2 = "Digite para acessar:\n1-Depositar.\n2-Sacar.\n3-Verificar saldo.";
			p3 = "Deseja realizar outra operação?\n1-Sim.\n2-Não.";
			p4 = "Digite o valor do depósito.";
			p5 = "Digite o valor do saque.";
			
			System.out.println(p1);
			p1 = scanner.next();
			
			switch(p1) {
			
			case "1":
				System.out.println(p2);
				p2 = scanner.next();
				
				if (p2.equals("1")) {
					System.out.println(p4);
					cc.setValor(scanner.nextDouble());
					cc.depositar();
					
				} else if (p2.equals("2")){
					System.out.println(p5);
					cc.setValor(scanner.nextDouble());
					cc.sacar();
					
				} else if (p2.equals("3")) {
					cc.verificarSaldo();
					
				} else {
					System.out.println("Informação incorreta.");
					
				}
			break;
			
			case "2":
				System.out.println(p2);
				p2 = scanner.next();
					
				if (p2.equals("1")) {
					System.out.println(p4);
					cp.setValor(scanner.nextDouble());
					cp.depositar();
					
				} else if (p2.equals("2")){
					System.out.println(p5);
					cp.setValor(scanner.nextDouble());
					cp.sacar();
					
				} else if (p2.equals("3")) {
					cp.verificarSaldo();
					
				} else {
					System.out.println("Informação incorreta.");
					
				}
			break;
				
			case "3":
				System.out.println(p2);
				p2 = scanner.next();
				
				if (p2.equals("1")) {
					System.out.println(p4);
					cr.setValor(scanner.nextDouble());
					cr.depositar();
						
				} else if (p2.equals("2")){
					System.out.println(p5);
					cr.setValor(scanner.nextDouble());
					cr.sacar();
					
				} else if (p2.equals("3")) {
					cr.verificarSaldo();
					
				} else {
					System.out.println("Informação incorreta.");
					
				}
			break;
			
			}
			
			
			System.out.println(p3);
			p3 = scanner.next();
			
		} while (p3.equalsIgnoreCase("1"));
		
		System.out.println("Fim do looping.");
		
		
		
		
		
		}
	}

}
