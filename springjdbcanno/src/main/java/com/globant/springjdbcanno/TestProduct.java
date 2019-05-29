package com.globant.springjdbcanno;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.globant.springjdbcanno.dao.ProductDao;

public class TestProduct {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
//		JdbcTemplate jt = (JdbcTemplate) context.getBean("getTemplate");
//		final String QUERY = "select * from product1";
//		List<Product> product = jt.query(QUERY, new BeanPropertyRowMapper<Product>(Product.class));
//		product.forEach(p->System.out.println(p.getProductid() + ":" + p.getName() + ":" + p.getPrice()));

		List<Product> products = ((ProductDao) context.getBean("productDAO")).getAll();
		products.forEach( d -> System.out.println(d.getProductid() + ":" + d.getName() + ":" + d.getPrice()));
	}

}
