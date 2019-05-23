package com.authentication.facade;

import java.util.List;

import com.authentication.model.ProductModel;
import com.authentication.service.ProductServiceImpl;

public class ProductFacadeImpl implements ProductFacade{

	@Override
	public List<ProductModel> getProducts() {
		return new ProductServiceImpl().getProducts();
	}
}
