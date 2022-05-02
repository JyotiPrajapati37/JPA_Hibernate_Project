package com.jpa.dao;

import java.util.List;

import com.jpa.entities.Book;

public interface BookDao {
	
	Book getBookById(int id);

	List<Book> getBookByTitle(String title);

	Long getBookCount();

	List<Book> getAuthorBooks(String author);

	List<Book> getAllBooks();

	List<Book> getBooksInPriceRange(double low, double high);


}

