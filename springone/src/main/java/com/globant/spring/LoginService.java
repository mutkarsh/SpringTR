package com.globant.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginService {
	@Autowired
	private AuthService authService;
	
	public AuthService getAuthService() {
		return authService;
	}

	public void setAuthService(AuthService authService) {
		this.authService = authService;
	}

	public void dologin() {
		System.out.println("dologin()...");
		authService.doauth();
	}
	
	

}
