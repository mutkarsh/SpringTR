package com.globant.spring;

import org.springframework.stereotype.Service;

@Service("authService")
public class AuthService {
	
	public void doauth() {

		System.out.println("doauth()...");
	}

}
