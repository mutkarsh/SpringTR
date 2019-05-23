package com.globant.contactmanager.dao;

import java.util.List;

import com.globant.contactmanager.model.ContactModel;

public interface ContactDAO {
	
	public int Create(ContactModel contact);
	public List<ContactModel> findALL();
	public ContactModel findById(int id);
	public int Update(ContactModel contact);
	public int remove(int id);
	

}
