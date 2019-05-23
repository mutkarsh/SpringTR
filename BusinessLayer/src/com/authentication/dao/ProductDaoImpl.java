package com.authentication.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.authentication.model.ProductModel;
import com.authentication.utils.JdbcUtil;


public class ProductDaoImpl implements ProductDao{
	
	@Override
	public List<ProductModel> getProducts() {
		List<ProductModel> products = new ArrayList<ProductModel>();
		final String QUERY ="select * from product1";
		Connection con = JdbcUtil.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs= null;
		try {
			stmt= con.prepareStatement(QUERY);
			rs = stmt.executeQuery();
			while(rs.next()) {
				products.add(new ProductModel(rs.getString(1),
						rs.getString(2),
						rs.getString(3)));
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return products;
	}

}		