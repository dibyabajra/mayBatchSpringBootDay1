package com.service;

import java.util.List;

import com.dto.BookDTO;

public interface BookService {

	void registerBook(BookDTO bookDTO);

	//com.dto.BookDTO authenticate(String Id, String name, String price);

	List<BookDTO> findAllBooks();

	void deleteBook(int bookId);

	BookDTO fetchRecord(int bookId);

	void updateBook(BookDTO bookDTO);



}

