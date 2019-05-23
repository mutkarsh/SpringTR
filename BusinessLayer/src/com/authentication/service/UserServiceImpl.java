package com.authentication.service;

import com.authentication.dao.UserDaoImpl;
import com.authentication.model.UserModel;

public class UserServiceImpl implements UserService {
	//private static UserServiceImpl service;
//	private UserServiceImpl() {
//		
//	}
//	public static UserServiceImpl getService() {
//		service = new UserServiceImpl();  
//		return service;
//	}

	@Override
	public boolean check(UserModel user) {
		return new UserDaoImpl().check(user);
	}

}
