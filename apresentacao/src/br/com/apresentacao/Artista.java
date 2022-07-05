package br.com.apresentacao;

public class Artista extends Encapsulamento{

	private String artista;
	private String compositor;
	private String tempo;
	private String estilo;
	private int ano;
	
	@Override
	public String artista() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	
	public String getCompositor() {
		return compositor;
	}

	public void setCompositor(String compositor) {
		this.compositor = compositor;
	}

	
	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	
	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	

	
	public void display() {
		System.out.println("Nome: " + nome + "\nArtista: " + artista + "\nCompostior: " + compositor + "\nTempo: " + tempo + "\nEstilo: " + estilo + "\nAno: " + ano);
	}
	

	
	
	
}
