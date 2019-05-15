package com.jpaCustomer1Product1.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product1 {
	
	@Id
	@Column(name = "id")
	private int pId;
	@Column(name = "name")
	private String pName;
	
	
	public Product1() {
		this.pId = 0;
		this.pName = "defaultProductName";
	}
	
	
	public String toString() {
		return "Product ID: "+this.getpId()
				+ " Product Name: "+this.getpName();
	}
	
	public Product1(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}
	
	
	public int getpId() {
		return pId;
	}
	
	public void setpId(int pId) {
		this.pId = pId;
	}
	
	public String getpName() {
		return pName;
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}
}



