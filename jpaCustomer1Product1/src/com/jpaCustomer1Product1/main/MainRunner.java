package com.jpaCustomer1Product1.main;

import com.jpaCustomer1Product1.services.Customer1DAO;
import com.jpaCustomer1Product1.services.Customer1Service;
import com.jpaCustomer1Product1.services.Product1DAO;
import com.jpaCustomer1Product1.services.Product1Service;

public class MainRunner {

	public static void main(String[] args) {
			// TODO Auto-generated method stub


			Customer1DAO customerDAO = new Customer1Service();
			Product1DAO productDAO = new Product1Service();

			// Unique ID
			customerDAO.addCustomer(1, "Maria", "a@live.com");
			customerDAO.addCustomer(2, "Max", "m@live.com");

			// Unique ID
			productDAO.addProduct(101, "Coffee");
			productDAO.addProduct(102, "Bagel");
			productDAO.addProduct(103, "Cup Cake");

			System.out.println("======================Get All Customers======================");
			customerDAO.getCustomers();

			System.out.println("======================Get All Products======================");
			productDAO.getProducts();

			System.out.println("======================Get Customer by ID======================");
			System.out.println(customerDAO.getCustomer(1));

			System.out.println("======================Get Product by ID======================");
			System.out.println(productDAO.getProduct(101));

			// One-to-many relation
			// Implement unique product item for each customer
			customerDAO.addProductToCustomer(1, 101);
			customerDAO.addProductToCustomer(1, 101); //Duplicate pair shouldn't be added into table, notify user
			customerDAO.addProductToCustomer(1, 102);
			customerDAO.addProductToCustomer(1, 103);
			customerDAO.addProductToCustomer(2, 101);
			customerDAO.addProductToCustomer(2, 102);

			// Customer-Products lookup
			System.out.println("======================Get Products by Customer======================");
			customerDAO.getCustomerProducts(1);
			
			// Remove A Customer
			customerDAO.removeCustomer(2);

			//Truncate the tables
//			em.getTransaction().begin();
//			em.createNativeQuery("DELETE FROM Customer_Product").executeUpdate();
//			em.createNativeQuery("DELETE FROM Customer").executeUpdate();
//			em.createNativeQuery("DELETE FROM Product").executeUpdate();
//			em.getTransaction().commit();
			

			// Close factory and manager
			Customer1Service.closeManagerAndFactory();
			Product1Service.closeManagerAndFactory();
		}

	}


