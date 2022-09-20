package com.author.service;

import java.util.List;
import java.util.Optional;

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

		@Override
		public List<Author> getAllAuthors() {
			return repository.findAll();
		}

		@Override
		public Optional<Author> getAuthorDetail(Integer id) {
			return repository.findById(id);
		}		
}