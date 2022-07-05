package br.senai.novatech.aulaabstracao;

public class ContaCorrente extends Conta {

	@Override
	public void depositar() {
		// TODO Auto-generated method stub				// atribuir um VALOR ao SALDO
		setSaldo(getSaldo() + getValor());
		System.out.println(getSaldo());
	}

	@Override
	public void sacar() {
		// TODO Auto-generated method stub				// tirar VALOR de SALDO
		setSaldo(getSaldo() - getValor());
		System.out.println(getSaldo());
	}

	@Override
	public void verificarSaldo() {
		// TODO Auto-generated method stub				// print SALDO
		System.out.println(getSaldo());
	}

	
	
}
