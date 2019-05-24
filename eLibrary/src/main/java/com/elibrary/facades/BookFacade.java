package com.elibrary.facades;

import java.util.List;
import org.springframework.stereotype.Service;
import com.elibrary.models.BookModel;

/*Utkarsh
 * 
 * Facade Layer Interface of elibrary 
 * 
 * */

@Service
public interface BookFacade {
	
	public int Add(BookModel book);
	public List<BookModel> findALL();
	public BookModel findByTitle(String title);
	public int remove(int id);
	

}
