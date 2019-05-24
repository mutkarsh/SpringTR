package com.elibrary.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/*Utkarsh
 * 
 * Page Controller to redirect to the jsp pages
 * */

@Controller
public class PageController {
	
	@GetMapping("/home")               //redirect to the home page 
	public String gohome() {
		return "home";
	}
	@GetMapping("/addbook")            //redirect to the viewBooks page from homepage
	public String addbook() {
		return "addbook";
	}
	@GetMapping("/viewbytitle")       //redirect to the search page from homepage
	public String searchbytitle() {
		return "search";
	}
		
}
