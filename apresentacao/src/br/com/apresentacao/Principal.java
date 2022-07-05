package br.com.apresentacao;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Artista e1 = new Artista();
		
		e1.setNome("Boa noite vizinhança.");
		e1.setArtista("Chespirito.");
		e1.setCompositor("Chespirito.");
		e1.setTempo("4:00.");
		e1.setEstilo("Clássico melhor que Beethoven.");
		e1.setAno(1973);
		
		e1.display();
		
	}

}
