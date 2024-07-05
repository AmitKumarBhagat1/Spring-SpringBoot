package com.restapi.book.dao;

import org.springframework.data.repository.CrudRepository;

import com.restapi.book.Entity.Book;

public interface BookRepo extends CrudRepository<Book,Integer>
{
	public Book findById(int id);
}
