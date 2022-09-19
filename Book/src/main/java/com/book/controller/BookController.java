package com.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.model.Book;
import com.book.service.IBookService;

@RestController
public class BookController {

	
	@Autowired
	IBookService bookService;
	
	@PostMapping("/createbook")
	public Integer saveBook(@RequestBody Book book) {
		Integer id = bookService.saveBook(book);
		System.out.println(id);
		return id;
	}
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello world";
	}
	
	@GetMapping("/getallbooks")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
	
	@GetMapping("/getemployeebytitle/{title}")
	public List<Book> getBookByName(@PathVariable String title){
		
		return null;
	}
}
