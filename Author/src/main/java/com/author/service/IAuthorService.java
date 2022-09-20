package com.author.service;

import java.util.List;
import java.util.Optional;

import com.author.entity.Author;

public interface IAuthorService {
	
	public Integer createAuthor(Author author); 
		
	public List<Author> getAllAuthors();
	
	public Optional<Author> getAuthorDetail(Integer id);

}
