package com.jpaCustomer1Product1.services;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpaCustomer1Product1.entities.Customer1;
import com.jpaCustomer1Product1.entities.Product1;

public class Customer1Service implements Customer1DAO {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpaCustomer1Product1");
	
	static EntityManager entitymanager = emf.createEntityManager();
		
			
	public void addCustomer(int cId, String cName, String cEmail) {
			Customer1 customer = new Customer1();
			customer.setcId(cId);
			customer.setcName(cName);
			customer.setcEmail(cEmail);
			saveCustomer(customer);
		}
		
		
		public void saveCustomer(Customer1 customer) {
			entitymanager.getTransaction().begin();
			entitymanager.persist(customer);
			entitymanager.getTransaction().commit();
		}
		
		
		public List<Customer1> getCustomers() {
			Query query = entitymanager.createQuery("select c from Customer1 c");
			List<Customer1> cList = query.getResultList();
			for (Customer1 customer : cList) {
				System.out.println(customer.toString());
				System.out.println("++++++++++++++++++++++");
			}
			return cList;
		}
		
		
		public void addProductToCustomer(int cId, int pId) {
			Product1 product = entitymanager.find(Product1.class, pId);
			Customer1 customer = getCustomer(cId);
			List<Product1> pList = customer.getcProducts();
			if(pList.contains(product)) {
				System.out.println("You've ordered the product already!");
			}else {
				customer.getcProducts().add(product);
				saveCustomer(customer);
			}
		}
		
		
		public Customer1 getCustomer(int cId) {
			Customer1 customer = entitymanager.find(Customer1.class, cId);
			return customer;
		}
		
		
		public void getCustomerProducts(int cId) {
			Customer1 customer = entitymanager.find(Customer1.class, cId);
			List<Product1> cProducts = customer.getcProducts();
			System.out.println("Customer ID: "+customer.getcId());
			for(Product1 product : cProducts) {
				System.out.println(product.toString());
				System.out.println("++++++++++++++++++++++");
			}
		}


		/* (non-Javadoc)
		 * @see jpa.dao.CustomerDAO#removeCustomer(int)
		 */
		@Override
		public void removeCustomer(int cId) {
			// TODO Auto-generated method stub
			Customer1 customer = getCustomer(cId);
			EntityTransaction tx = entitymanager.getTransaction();
			tx.begin();
			entitymanager.remove(customer);
			tx.commit();
			System.out.println("Customer removed with id: "+cId);
		}
		
		
		public static void closeManagerAndFactory() {
			entitymanager.close();
			emf.close();
		}
		
		
	}

	

	

