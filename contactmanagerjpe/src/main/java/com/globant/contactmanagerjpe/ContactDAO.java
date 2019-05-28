package com.globant.contactmanagerjpe;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("contactDAO")
public interface ContactDAO extends CrudRepository<Contact, Integer>{
	
	public Contact findByEmail(String email);

	
}
