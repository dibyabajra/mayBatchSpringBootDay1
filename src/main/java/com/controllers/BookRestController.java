package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.dto.BookDTO;
import com.service.BookServiceImpl;


public class BookRestController {
	
	@Autowired
	BookServiceImpl bookServiceImpl;
	
	@GetMapping("/books")
	public String books() {
		bookServiceImpl.findAllBooks();
		return "List all books";
	}
		
	@PostMapping("/books")
	public String productbooks() {
		return "Save a book";
	}
	
	@GetMapping("/books/{id}")
	public String getbookById(@RequestParam int id) {
		return "Find a book where id={:id}";
	}
	
	@PutMapping("/books/{id}")
	public String updatebook(@RequestBody BookDTO bookDTO) {
        
		bookServiceImpl.updateBook(bookDTO);
		return "updated successfully";
	}
}
