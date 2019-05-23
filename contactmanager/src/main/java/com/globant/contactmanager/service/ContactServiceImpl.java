package com.globant.contactmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.globant.contactmanager.dao.ContactDaoImpl;
import com.globant.contactmanager.model.ContactModel;
@Service
public class ContactServiceImpl implements ContactService{
	@Autowired
	private ContactDaoImpl contactdaoimpl;

	public int Create(ContactModel contact) {
		
		return contactdaoimpl.Create(contact);
	}

	public List<ContactModel> findALL() {
		
		return contactdaoimpl.findALL();
	}

	public ContactModel findById(int id) {
		return contactdaoimpl.findById(id);
	}

	public int Update(ContactModel contact) {
		return contactdaoimpl.Update(contact);
	}

	public int remove(int id) {
		return contactdaoimpl.remove(id);
	}
	
	

}
