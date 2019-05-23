package com.globant.contactmanager.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globant.contactmanager.model.ContactModel;
import com.globant.contactmanager.service.ContactServiceImpl;
@Service
public class ContactFacadeImpl implements ContactFacade{
	
	@Autowired
	private ContactServiceImpl contactserviceimpl;
	
	public int Create(ContactModel contact) {
		return  contactserviceimpl.Create(contact);
	}

	public List<ContactModel> findALL() {
		return  contactserviceimpl.findALL();
	}

	public ContactModel findById(int id) {
		return  contactserviceimpl.findById(id);
	}

	public int Update(ContactModel contact) {
		return  contactserviceimpl.Update(contact);
	}

	public int remove(int id) {
		return contactserviceimpl.remove(id) ;
	}
	
	

}
