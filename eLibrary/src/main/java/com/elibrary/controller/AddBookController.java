package com.elibrary.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.elibrary.facades.BookFacade;
import com.elibrary.models.BookModel;

/*
 * controller for adding book entry
 * */

@Controller
public class AddBookController {
	
	@Autowired
	private BookFacade bookfacade;
	
	@PostMapping("/add")
	public String AddBook(@RequestParam("isbn") String isbn,@RequestParam("title") String title,@RequestParam("author") String author,@RequestParam("publisher") String publisher,@RequestParam("qty") int qty) {
		BookModel book = new BookModel();
		book.setIsbn(isbn);
		book.setAuthor(author);
		book.setPublisher(publisher);
		book.setTitle(title);
		book.setQty(qty);
		bookfacade.Add(book);
		return "addbook";
	}
	
	
	
	
}
