package com.globant.contactmanagerweb;

import java.util.List;
import java.util.stream.Collector;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.globant.contactmanager.facade.ContactFacade;
import com.globant.contactmanager.model.ContactModel;

@RestController
public class ContactWebService {
	@Autowired
	private ContactFacade contactfacade;

//	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@GetMapping("/contacts")
	public List<ContactModel> getContacts() {

		return contactfacade.findALL();
	}
	
	@GetMapping("/contact/{id}")
	public ContactModel getContactById(@PathVariable("id") int id) {

		return contactfacade.findById(id);
	}
	
	@PostMapping("/contact/add")
	public String createContact(@RequestBody ContactModel c) {
		
		System.out.println(c);
		contactfacade.Create(c);
		return "OK";
	}
	
	@DeleteMapping("/contact/delete/{id}")
	public String createContact(@PathVariable("id") int id) {
		
		contactfacade.remove(id);
		return "OK Done!";
	}
	
	@PutMapping("/contact/update")
	public String updateContact(@RequestBody ContactModel c) {
		
		contactfacade.Update(c);
		return "OK Done!";
	}
	


}
