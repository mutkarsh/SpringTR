package com.globant.springjdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;


public class App {
	
	private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	private static JdbcTemplate jt = (JdbcTemplate) context.getBean("jdbcTemplate");

	public static void main(String[] args) {

//		xfindById(1);
//		XfindAll();
//		create(4,"tv remote","200");
//		count();
		NfindById(3);
	}
	
	private static void create(int productid,String name,String price) {

		final String QUERY = "insert into product1(productid,name,price) values(?,?,?) ";
		Object param[] = { productid ,name ,price };
		int n = jt.update(QUERY, param);
		System.out.println(n+" records inserted...");
	}


	private static void findById(int id) {

		final String QUERY = "select * from product1 where productid=?";
		Object param[] = { id };
		Product p = jt.queryForObject(QUERY, param, new BeanPropertyRowMapper<Product>(Product.class));
		System.out.println(p.getProductid() + ":" + p.getName() + ":" + p.getPrice());
	}
	
	private static void NfindById(int id) {

		final String QUERY = "select * from product1 where productid=:xyz";
		DriverManagerDataSource ds = (DriverManagerDataSource) context.getBean("dataSource");
		NamedParameterJdbcTemplate npjt = new NamedParameterJdbcTemplate(ds);
		MapSqlParameterSource param = new MapSqlParameterSource();
		param.addValue("xyz", id);
		Product p = npjt.queryForObject(QUERY, param, new BeanPropertyRowMapper<Product>(Product.class));
		System.out.println(p.getProductid() + ":" + p.getName() + ":" + p.getPrice());
	}

	private static void findAll() {

		final String QUERY = "select * from product1";
		List<Product> p =  jt.query(QUERY, new BeanPropertyRowMapper<Product>(Product.class));
		p.forEach( d -> System.out.println(d.getProductid() + ":" + d.getName() + ":" + d.getPrice()));
	}
	private static void XfindAll() {

		final String QUERY = "select * from product1";
		List<Product> pr =  jt.query(QUERY, (rs,rowNum)->{
			Product p = new Product();
			p.setProductid(rs.getInt("productid"));
			p.setName(rs.getString("name"));
			p.setPrice(rs.getString("price"));		
			return p;
		});
		pr.forEach( d -> System.out.println(d.getProductid() + ":" + d.getName() + ":" + d.getPrice()));
	}
	private static void xfindById(int id) {

		final String QUERY = "select * from product1 where productid=?";
		Object param[] = { id };
		Product p = jt.queryForObject(QUERY, param, new RowMapper<Product>() {
			@Override
			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
				Product p = new Product();
				p.setProductid(rs.getInt("productid"));
				p.setName(rs.getString("name"));
				p.setPrice(rs.getString("price"));		
				return p;
			}
		});
		System.out.println(p.getProductid() + ":" + p.getName() + ":" + p.getPrice());
	}
	
	public static void count() {
		String QUERY="select count(*) from product1";
		int c = jt.queryForObject(QUERY, Integer.class);
		System.out.println("total Records :"+c);
	}
	
}
