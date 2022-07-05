package br.com.senaibrasilia.projetofinal.test;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.senaibrasilia.projetofinal.dao.CategoriaDAO;
import br.com.senaibrasilia.projetofinal.dao.ProdutoDAO;
import br.com.senaibrasilia.projetofinal.model.Categoria;
import br.com.senaibrasilia.projetofinal.model.Produto;
import br.com.senaibrasilia.projetofinal.util.JPAUtil;

public class Principal {

	 private static void cadastrarProduto() {
	        Categoria tecnologia = new Categoria("TECNOLOGIA");
	        Produto celular = new Produto("Samsung J5", "Ano: 2015", new BigDecimal("600"), tecnologia );
	       
	        EntityManager em = JPAUtil.getEntityManager();
	        ProdutoDAO produtoDAO = new ProdutoDAO(em);
	        CategoriaDAO categoriaDAO = new CategoriaDAO(em);
	       
	        em.getTransaction().begin();
	       
	        categoriaDAO.cadastrar(tecnologia);
	        produtoDAO.cadastrar(celular);
	       
	        em.getTransaction().commit();
	        em.close();
	    }
	 
	public static void main(String[] args) {
		
		cadastrarProduto();
        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDAO produtoDAO = new ProdutoDAO(em);
       
        Produto p = produtoDAO.buscarPorId(3);
        System.out.println(p.getPreco());
       
        List<Produto> todos = produtoDAO.buscarPorNomeDaCategoria("TECNOLOGIA");
        todos.forEach(p2 -> System.out.println(p.getNome()));
   
        BigDecimal precoDoProduto = produtoDao.buscarPrecoDoProdutoComNome("Samsung J5");
        System.out.println("Preco do Produto: " +precoDoProduto);
    }


		
//		 Produto p = new Produto();
//		 p.setId(null);
//		 p.setNome("Teste");
//		 p.setDataCadastro(null);
//		 p.setDescricao(null);
//		 p.setPreco(null);
//		 
//		 System.out.println(p.getNome());
//		 
//		 
//		 Categoria c = new Categoria();
//		 c.setNome("Eletrônico");
		 
		 // configura com o persistence.xml - ligação <persistence.unit
//		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
//		 
//		 EntityManager em = factory.createEntityManager();
		 
//		 em.getTransaction().begin();
//		 // entra no estado gerenciado 
//		 em.persist(p);
//		 em.persist(c);
//		 // salva no banco
//		 em.getTransaction().commit();
//		 // fecha
//		 em.close();
		 
		 

	}


