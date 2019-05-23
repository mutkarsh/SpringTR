package com.authentication.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.authentication.model.UserModel;
import com.authentication.utils.JdbcUtil;

public class UserDaoImpl implements UserDao{
	
	@Override
	public boolean check(UserModel user) {
		final String QUERY ="select * from user where userid=? and password=?";
		Connection con = JdbcUtil.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs= null;
		boolean valid= false;
		try {
			stmt= con.prepareStatement(QUERY);
			stmt.setString(1, user.getUserid());
			stmt.setString(2, user.getPassword());
			rs = stmt.executeQuery();
			if(rs.next()) {
				valid=true;
			}
			rs.close();
			stmt.close();
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return valid;
	}
}
