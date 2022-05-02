package com.jpa.service;


import java.util.List;

import com.jpa.entities.Book;

public interface BookService {
//	getBookById
	Book getBookById(int id);

//	getBookByTitle
	List<Book> getBookByTitle(String title);

//	getBookCount
	Long getBookCount();

//	getAuthorBooks
	List<Book> getAuthorBooks(String author);

//	getAllBooks
	List<Book> getAllBooks();

//	getBooksInPriceRange
	List<Book> getBooksInPriceRange(double low, double high);
}
