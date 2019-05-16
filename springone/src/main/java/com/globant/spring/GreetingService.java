package com.globant.spring;

import org.springframework.beans.factory.BeanNameAware;

public class GreetingService implements BeanNameAware{
	private String msg;
	private String msg1;
	private String name;
	
	public void init() {

		System.out.println("init method of greeting service!!");
		
	}
	public GreetingService(String msg,String msg1) {
		this.msg=msg;
		this.msg1=msg1;
	}
	
	public String greet() {
		return msg+msg1;
	}
	
	public void setBeanName(String name) {	
		this.name=name;
	}
	public String getName() {
		return name;
	}

	
}
