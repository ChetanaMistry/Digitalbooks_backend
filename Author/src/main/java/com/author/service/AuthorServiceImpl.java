package com.author.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.author.entity.Author;

@Service
public class AuthorServiceImpl implements IAuthorService{

		@Autowired
		IAuthorRepository repository;

		@Override
		public Integer createAuthor(Author author) {
			Author savedAuthor = repository.save(author);
			return savedAuthor.getId();
		}
		
		
}
