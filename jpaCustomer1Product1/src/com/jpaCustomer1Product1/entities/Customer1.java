package com.jpaCustomer1Product1.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="customer1")
public class Customer1 {
		
		@Id
		@Column(name = "id")
		private int cId;

		@Column(name = "name")
		private String cName;
		
	@Column(name = "email")
		private String cEmail;
		
		
	@OneToMany
		List<Product1> cProducts;

		
		
		public Customer1() {
			this.cId = 0;
			this.cName = "defaultCustName";
			this.cEmail = "defaultCustEmail@email.com";
			this.cProducts = new ArrayList<Product1>();
		}
		
		
		public Customer1(int cId, String cName, String cEmail, List<Product1> cProducts) {
			super();
			this.cId = cId;
			this.cName = cName;
			this.cEmail = cEmail;
			this.cProducts = cProducts;
		}
		
		
		public String toString() {
			return "Customer ID: "+this.getcId()
					+ " Customer Name: "+this.getcName()
					+ " Customer Email: "+this.getcEmail();
		}
		
		public int getcId() {
			return cId;
		}
		
		public void setcId(int cId) {
			this.cId = cId;
		}
		
		public String getcName() {
			return cName;
		}
		
		public void setcName(String cName) {
			this.cName = cName;
		}
		
		public String getcEmail() {
			return cEmail;
		}
		
		public void setcEmail(String cEmail) {
			this.cEmail = cEmail;
		}

		public List<Product1> getcProducts() {
			return cProducts;
		}

		public void setcProducts(List<Product1> cProducts) {
			this.cProducts = cProducts;
		}
	}


