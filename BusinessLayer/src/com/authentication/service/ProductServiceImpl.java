package com.authentication.service;

import java.util.List;

import com.authentication.dao.ProductDaoImpl;
import com.authentication.model.ProductModel;

public class ProductServiceImpl implements ProductService{

	@Override
	public List<ProductModel> getProducts() {
		return new ProductDaoImpl().getProducts();
	}
}
