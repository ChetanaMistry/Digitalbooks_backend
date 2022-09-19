package com.book.service;

import java.util.List;

import com.book.model.Book;


public interface IBookService {
	
	public Integer saveBook(Book book);
	
	public List<Book> getAllBooks();
	
	public List<Book> getBookByName(String title);
	
	//public Book updateBook(Book book, Integer id);

}
