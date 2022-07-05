package br.senai.novatech.aulaabstracao;

public abstract class Conta {
	
	private double numero, saldo, valor;

		public double getNumero() {
			return numero;
		}
		public void setNumero(double numero) {
			this.numero = numero;
		}
		
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		public double getValor() {
			return valor;
		}
		public void setValor(double valor) {
			this.valor = valor;
		}
	
	public abstract void depositar();                 // atribuir um VALOR ao SALDO
	public abstract void sacar();                     // tirar VALOR de SALDO
	public abstract void verificarSaldo();            // print SALDO
	
	
}
