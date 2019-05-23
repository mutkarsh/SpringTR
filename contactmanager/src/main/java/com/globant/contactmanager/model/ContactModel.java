package com.globant.contactmanager.model;

import org.springframework.stereotype.Service;

@Service
public class ContactModel {
	private int id;
	private String name;
	private String email;
	private String mobileno;
	
	
	
	public ContactModel() {
		// TODO Auto-generated constructor stub
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileno() {
		return mobileno;
	}

	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	
	@Override
	public String toString() {
		return id+":"+name+":"+email+":"+mobileno;
	}
	
}
