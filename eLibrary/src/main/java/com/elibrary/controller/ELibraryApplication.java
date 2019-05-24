package com.elibrary.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
 * Main Springboot Application
 * with configuration   
 * */

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"com.elibrary"} )
public class ELibraryApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ELibraryApplication.class, args);
	}

}
