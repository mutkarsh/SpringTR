package com.globant.contactmanager;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.globant.contactmanager.facade.ContactFacadeImpl;
import com.globant.contactmanager.model.ContactModel;

public class TestContact {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		
		ContactModel contact = (ContactModel) context.getBean("contactModel");
		contact.setName("Bran");
		contact.setEmail("Bran@mail.com");
		contact.setMobileno("6789");
		
//		int n = ((ContactFacadeImpl) context.getBean("contactFacadeImpl")).Create(contact);
//		System.out.println(n+" records inserted");
//		
//		List<ContactModel> cm = ((ContactFacadeImpl) context.getBean("contactFacadeImpl")).findALL();
//		cm.forEach(System.out::println);
//		
		System.out.println(((ContactFacadeImpl)context.getBean("contactFacadeImpl")).findById(2));
		
		
		
	}

}
