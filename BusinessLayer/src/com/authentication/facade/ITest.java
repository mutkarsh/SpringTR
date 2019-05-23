package com.authentication.facade;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.authentication.model.ProductModel;

public class ITest {
	private ProductFacade productfacade = new ProductFacadeImpl();
	
	@Test
	public void testCheck() {
		List<ProductModel> p = productfacade.getProducts();
		assertEquals(4,p.size());
	}

}
