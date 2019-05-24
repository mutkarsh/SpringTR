package com.elibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.elibrary.facades.BookFacade;
import com.elibrary.models.BookModel;

/*
 * Delete Controller for delete a book entry
 * */

@Controller
public class DeleteBookController {
	
	@Autowired
	private BookFacade bookfacade;
	
	@PostMapping("/deletebook")
	public String deleteBooks(Model model,@RequestParam("id") int id){
		bookfacade.remove(id);
		List<BookModel> books = bookfacade.findALL();
		model.addAttribute("books", books);
		return "viewbooks";
	}

}
