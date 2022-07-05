package br.com.senaibrasilia.projetofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/* enum -> conjunto de constantes
	public enum Categoria {

	ELETRONICOS,
	ROUPAS,
	COMIDA;
	}
	*/

@Entity
@Table(name="categorias")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Categoria() {
		super();
	}
	public Categoria(String nome) {
		super();
		this.nome = nome;
	}
//	public Categoria(Long id, String nome) {
//		super();
//		this.id = id;
//		this.nome = nome;
//	}
	
	
}
