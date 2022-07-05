package br.senai.novatech.aulaabstracao;

public class ContaPoupanca extends Conta {

	@Override
	public void depositar() {
		// TODO Auto-generated method stub
		setSaldo(getSaldo() + getValor());
		System.out.println(getSaldo());
	}

	@Override
	public void sacar() {
		// TODO Auto-generated method stub
		setSaldo(getSaldo() - getValor());
		System.out.println(getSaldo());
	}

	@Override
	public void verificarSaldo() {
		// TODO Auto-generated method stub
		System.out.println(getSaldo());
	}

	
	
	
	
	
}
