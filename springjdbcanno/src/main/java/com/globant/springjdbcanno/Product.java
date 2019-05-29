package com.globant.springjdbcanno;

public class Product {
	private int productid;
	private String name;
	private String price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public int getProductid() {
		return productid;
	}
	
	public void setProductid(int productid) {
		this.productid = productid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
}
