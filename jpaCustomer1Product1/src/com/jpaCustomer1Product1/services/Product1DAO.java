package com.jpaCustomer1Product1.services;

import java.util.List;

import com.jpaCustomer1Product1.entities.Product1;

public interface Product1DAO {
	//Add A Product
		public void addProduct(int pId, String pName);
		
		//Get All Products
		public List<Product1> getProducts();
		
		//Get A Product
		public Product1 getProduct(int pId);

}
