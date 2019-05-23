package com.authentication.model;

public class ProductModel {
	private String ProductID;
	private String name;
	private String price;
	
	public ProductModel() {
		// TODO Auto-generated constructor stub
	}
	public ProductModel(String productID, String name, String price) {
		super();
		ProductID = productID;
		this.name = name;
		this.price = price;
	}
	public String getProductID() {
		return ProductID;
	}
	public void setProductID(String productID) {
		ProductID = productID;
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
