package com.globant.contactmanager.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.globant.contactmanager.model.ContactModel;

@Service
public class ContactDaoImpl implements ContactDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int Create(ContactModel contact) {
		String QUERY= "insert into contact(name,email,mobileno) values(?,?,?)";
		Object param[]= {contact.getName(),contact.getEmail(),contact.getMobileno()};
		return jdbcTemplate.update(QUERY,param);
	}

	public List<ContactModel> findALL() {
		String QUERY = "select * from contact";
		return jdbcTemplate.query(QUERY, new BeanPropertyRowMapper<ContactModel>(ContactModel.class));
	}

	public ContactModel findById(int id) {
		String QUERY = "select * from contact where id=?";
		Object param[]= {id};
		return jdbcTemplate.queryForObject(QUERY,param, new BeanPropertyRowMapper<ContactModel>(ContactModel.class));
	}

	public int Update(ContactModel contact) {
		String QUERY = "update contact set name=? ,email=? ,mobileno=? where id=?";
		Object param[]= {contact.getName(),contact.getEmail(),contact.getMobileno(),contact.getId()};
		return jdbcTemplate.update(QUERY,param);
	}

	public int remove(int id) {
		String QUERY = "delete from contact where id=?";
		Object param[]= {id};
		return jdbcTemplate.update(QUERY,param);
	}

	
	

}
