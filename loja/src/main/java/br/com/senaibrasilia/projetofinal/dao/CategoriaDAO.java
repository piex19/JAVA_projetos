package br.com.senaibrasilia.projetofinal.dao;

import javax.persistence.EntityManager;

import br.com.senaibrasilia.projetofinal.model.Categoria;

public class CategoriaDAO {
	
	private EntityManager em;
	
	public CategoriaDAO(EntityManager em) {
		this.em = em;
	}

	public void cadastrar(Categoria categoria) {
		// persist
		this.em.persist(categoria);
	}
	public void alterar(Categoria categoria) {
		// merge
		this.em.merge(categoria);
	}
	public void remover(Categoria categoria) {
		categoria = em.merge(categoria);
		this.em.remove(categoria);
	}
	
//	public Categoria pesquisarPorCodigo(Long id) {
//		// find
//		return em.find(Categoria.class, id);
//	}
//	public List<Categoria> pesquisarPorNome(String nome) {
//		String jpql = "SELECT p FROM Categoria ca WHERE ca.nome = :nome";
//		return em.createQuery(jpql, Categoria.class)
//				.setParameter("nome", nome)
//				.getResultList();
//	}
//	public List<Categoria> pesquisarTodos() {
//		// query jpql 
//		// arraylist - list
//		// lambda - java8
//		String jpql = "SELECT ca FROM Categoria ca";
//		return em.createQuery(jpql, Categoria.class).getResultList();
//	}
	
}
	

