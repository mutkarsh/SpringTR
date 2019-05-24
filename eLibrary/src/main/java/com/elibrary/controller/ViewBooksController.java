package com.elibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.elibrary.facades.BookFacade;
import com.elibrary.facades.BookFacadeImpl;
import com.elibrary.models.BookModel;

/*
 * Controller for show all books 
 * */

@Controller
public class ViewBooksController {

	@Autowired
	private BookFacade bookfacade;
	
	@GetMapping("/viewbook")
	public String showBooks(Model model){

		List<BookModel> books = bookfacade.findALL();
		model.addAttribute("books", books);
		return "viewbooks";
	}
}
