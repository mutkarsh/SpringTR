package com.authentication.facade;

import com.authentication.model.UserModel;
import com.authentication.service.UserServiceImpl;

public class UserFacadeImpl implements UserFacade{
	
	@Override
	public boolean check(UserModel user) {
		
		return new UserServiceImpl().check(user);
	}

}
