package com.globant.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class FooService implements ApplicationContextAware{
	private ApplicationContext context;
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = applicationContext;
	}
	
	public void print() {
		GreetingService gs = (GreetingService) context.getBean("greetingService");
		System.out.println(gs.greet());
	}
	

}
