package com.elibrary.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Service;

/*Utkarsh
 * 
 * Book Model to Store book related information 
 * A simple pojo class
 * */
@Service
public class BookModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)   // to make id as auto increment value in the databases
	private int id;                                         
	private String isbn;
	private String title;
	private String Author;
	private String Publisher;
	private int qty;
	//Constructor
	public BookModel() {
	}
	
	//Getters and Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getPublisher() {
		return Publisher;
	}

	public void setPublisher(String publisher) {
		Publisher = publisher;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}
