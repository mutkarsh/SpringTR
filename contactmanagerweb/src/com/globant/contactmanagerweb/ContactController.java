package com.globant.contactmanagerweb;

import java.util.List;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.globant.contactmanager.App;
import com.globant.contactmanager.facade.ContactFacadeImpl;
import com.globant.contactmanager.model.ContactModel;


@Controller
public class ContactController {

	@RequestMapping(value = "/show", method = RequestMethod.GET)
	public String ShowContacts(Model model) throws java.io.IOException {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class);

		List<ContactModel> contact = ((ContactFacadeImpl) context.getBean("contactFacadeImpl")).findALL();
//		List<ContactModel> contact =facade.findALL();
		System.out.println(contact.toString());
		model.addAttribute("contact", contact);
		context.close();
		return "contacts";
		
		

	}

}
