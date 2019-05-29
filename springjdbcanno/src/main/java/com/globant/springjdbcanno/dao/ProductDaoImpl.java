package com.globant.springjdbcanno.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.globant.springjdbcanno.Product;

@Service("productDAO")
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Product> getAll() {
		
		final String QUERY = "select * from product1";
		return jdbcTemplate.query(QUERY, new BeanPropertyRowMapper<Product>(Product.class));
	}
	

}
