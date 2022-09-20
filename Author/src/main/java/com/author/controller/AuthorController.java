package com.author.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.author.entity.Author;
import com.author.service.IAuthorService;

@RestController
public class AuthorController {

	@Autowired
	IAuthorService authorService;
	
	@PostMapping("/createauthor")
	public Integer createAuthor(@RequestBody Author author) {
		Integer id = authorService.createAuthor(author);
		return id;
	}

	@GetMapping("/allauthor")
	public List<Author> getAllAuthor(){
		return authorService.getAllAuthors();
	}
	
	@GetMapping("/getauthorDetail/{id}")
	public Optional<Author> getAuthorDetails(@PathVariable Integer id) {
		return authorService.getAuthorDetail(id);
	}
}
