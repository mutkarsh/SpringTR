package com.elibrary.facades;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elibrary.models.BookModel;
import com.elibrary.service.BookServiceImpl;


/*Utkarsh
 * 
 * Implementation of Facade Layer Interface
 *  
 * */


@Service
public class BookFacadeImpl implements BookFacade{
	@Autowired
	private BookServiceImpl bookservice;            

	@Override
	public int Add(BookModel book) {           // add a bookmodel object to the database from facade layer  
		return bookservice.Add(book);
	}

	@Override
	public List<BookModel> findALL() {        // findall the books from the database through the facade layer
		return bookservice.findALL();
	}
	
	@Override
	public BookModel findByTitle(String title) {  // find the book by title from facade layer 
		return bookservice.findByTitle(title);
	}

	@Override
	public int remove(int id) {                  // remove the book from database  through facade layer 
		return bookservice.remove(id);
	}
	

}
