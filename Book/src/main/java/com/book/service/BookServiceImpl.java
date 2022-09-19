package com.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.model.Book;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	IBookRepository repository;

	@Override
	public Integer saveBook(Book book) {
		Book savedBook = repository.save(book);
		return savedBook.getId();
	}

	@Override
	public List<Book> getAllBooks() {
		return repository.findAll();
	}

	@Override
	public List<Book> getBookByName(String title) {
		
		// filter books by title
		return repository.findAll();
	}
	
	/*@Override
	public Book updateBook(Book book, Integer id) {
		Book existingBook = repository.findById(id);
		
		existingBook.setTitle(book.getTitle());
		existingBook.setCategory(book.getCategory());
		existingBook.setActive(book.getActive());
		existingBook.setContent(book.getContent());
		existingBook.setPublisher(book.getPublisher());
		existingBook.setPrice(book.getPrice());
		
		repository.save(existingBook);
		return existingBook;
	}*/
	
	
}
