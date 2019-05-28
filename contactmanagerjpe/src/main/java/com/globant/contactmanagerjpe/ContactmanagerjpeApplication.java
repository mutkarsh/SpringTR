package com.globant.contactmanagerjpe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ContactmanagerjpeApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ContactmanagerjpeApplication.class, args);

		Contact contact = new Contact();
		contact.setName("Bran");
		contact.setEmail("bran@mail.com");

		ContactDAO contactDao = (ContactDAO) context.getBean("contactDAO");

//		contactDao.save(contact);

		 contactDao.findAll().forEach(System.out::println);

//		System.out.println(contactDao.findByEmail("winston@email.com"));
	}

}
