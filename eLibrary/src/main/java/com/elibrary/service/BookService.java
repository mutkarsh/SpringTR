package com.elibrary.service;

import java.util.List;

import com.elibrary.models.BookModel;

/*Utkarsh
 * 
 * Interface for service layer 
 * */
public interface BookService {
	
	public int Add(BookModel book);
	public List<BookModel> findALL();
	public BookModel findByTitle(String title);
	public int remove(int id);

}
