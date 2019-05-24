package com.elibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.elibrary.facades.BookFacade;
import com.elibrary.models.BookModel;

/*
 * Controller for search request 
 * */

@Controller
public class SearchBookController {
	@Autowired
	private BookFacade bookfacade;
	@GetMapping("/searchbook")
	public String searchBookbyTitle(Model model,@RequestParam("title") String title) {
		
		BookModel searchresult = bookfacade.findByTitle(title);
		model.addAttribute("result",searchresult);
		return "search";
	}

}
