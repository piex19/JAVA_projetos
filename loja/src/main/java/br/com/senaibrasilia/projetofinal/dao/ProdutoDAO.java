package br.com.senaibrasilia.projetofinal.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.senaibrasilia.projetofinal.model.Produto;

public class ProdutoDAO {
	
	private EntityManager em;

	public void cadastrar(Produto produto) {
		// persist
		this.em.persist(produto);
	}
	public void alterar(Produto produto) {
		// merge
		this.em.merge(produto);
	}
	public void remover(Produto produto) {
		produto = em.merge(produto);
		this.em.remove(produto);
	}
	
	public Produto pesquisarPorCodigo(Long id) {
		// find
		return em.find(Produto.class, id);
	}
	public List<Produto> pesquisarPorNome(String nome) {
		String jpql = "SELECT p FROM Produto p WHERE p.nome = :nome";
		return em.createQuery(jpql, Produto.class)
				.setParameter("nome", nome)
				.getResultList();
	}
	public List<Produto> pesquisarTodos() {
		// query jpql 
		// arraylist - list
		// lambda - java8
		String jpql = "SELECT p FROM Produto p";
		return em.createQuery(jpql, Produto.class).getResultList();
	}
	public List<Produto> buscarPorNomeDaCategoria(String nome){
		String jpql = "SELECT p FROM Produto p WHERE p.categoria.nome = :nome";
		return em.createQuery(jpql, Produto.class)
				.setParameter("nome", nome)
				.getResultList();
	}
	
}
