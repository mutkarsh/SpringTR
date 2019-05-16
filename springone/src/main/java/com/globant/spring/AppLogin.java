package com.globant.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppLogin {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("main.xml");
        LoginService ls = (LoginService) context.getBean("loginService");
        ls.dologin();
        context.registerShutdownHook();
        context.close();
	}

}