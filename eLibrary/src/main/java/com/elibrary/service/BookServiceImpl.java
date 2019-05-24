package com.elibrary.service;

import java.util.List;

/*Utkarsh
 * 
 * Implementation of Servicelayer Interface
 *  
 * */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elibrary.daos.BookDaoImpl;
import com.elibrary.models.BookModel;
@Service
public class BookServiceImpl implements BookService{
	@Autowired
	private BookDaoImpl bookdao;
	
	@Override
	public int Add(BookModel book) {
		return bookdao.Add(book);
	}

	@Override
	public List<BookModel> findALL() {
		return bookdao.findALL();
	}

	@Override
	public BookModel findByTitle(String title) {
		return bookdao.findByTitle(title);
	}

	@Override
	public int remove(int id) {
		return bookdao.remove(id);
	}

}
