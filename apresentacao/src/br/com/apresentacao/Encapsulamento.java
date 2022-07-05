package br.com.apresentacao;

public abstract class Encapsulamento {
	
	protected String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public abstract String artista();
	
	
	
	
}
