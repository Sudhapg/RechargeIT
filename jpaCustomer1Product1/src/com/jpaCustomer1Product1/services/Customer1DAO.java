package com.jpaCustomer1Product1.services;

import java.util.List;

import com.jpaCustomer1Product1.entities.Customer1;

public interface Customer1DAO {
	
	//Add A Customer
		public void addCustomer(int cId, String cName, String cEmail);
		
		//Get All Customer
		public List<Customer1> getCustomers();
		
		//Get A Customer
		public Customer1 getCustomer(int cId);
		
		//Add Product to Customer
		public void addProductToCustomer(int cId, int pId);
		
		//Get A Customer Products
		public void getCustomerProducts(int cId);
		
		//Remove A Customer
		public void removeCustomer(int cId);

}
