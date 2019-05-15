package com.jpaCustomer1Product1.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpaCustomer1Product1.entities.Product1;

public class Product1Service implements Product1DAO {

	/* (non-Javadoc)
	 * @see jpa.dao.ProductDAO#addProduct(int, java.lang.String)
	 */
	
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaCustomer1Product1");
	static EntityManager entitymanager = emf.createEntityManager();
	
	public void addProduct(int pId, String pName) {
		Product1 product = new Product1();
		product.setpId(pId);
		product.setpName(pName);
		saveProduct(product);
	}
	
	
	public void saveProduct(Product1 product) {
		entitymanager.getTransaction().begin();
		entitymanager.persist(product);
		entitymanager.getTransaction().commit();
	}

	/* (non-Javadoc)
	 * @see jpa.dao.ProductDAO#getProducts()
	 */
	@Override
	public List<Product1> getProducts() {
		Query query = entitymanager.createQuery("select p from Product1 p");
		List<Product1> pList = query.getResultList();
		for (Product1 product : pList) {
			System.out.println(product.toString());
			System.out.println("++++++++++++++++++++++");
		}
		return pList;
	}
	
	
	public Product1 getProduct(int pId) {
		Product1 product = entitymanager.find(Product1.class, pId);
		return product;
		
	}
	
	public static void closeManagerAndFactory() {
		entitymanager.close();
		emf.close();
	}
	

}
