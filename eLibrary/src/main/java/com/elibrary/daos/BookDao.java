package com.elibrary.daos;

import java.util.List;


import com.elibrary.models.BookModel;

/*Utkarsh
 * 
 * 
 * Book DAO Interface 
 * 
 * */
public interface BookDao  {          
	
	public int Add(BookModel book);             //method to add book in the database
	public List<BookModel> findALL();           //method to find all the books in the database
	public BookModel findByTitle(String title);  //method to find book by title
	public int remove(int id);                   //method to remove book from the database
	
}
