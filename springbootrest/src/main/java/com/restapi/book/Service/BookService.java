package com.restapi.book.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.restapi.book.Entity.Book;
import com.restapi.book.dao.BookRepo;
//@Service
@Component
public class BookService {
	
	@ Autowired
	private BookRepo bookRepo;

	
	//Get all the Books
	public List<Book> getAllBooks()
	{
		List<Book> all = (List<Book>) this.bookRepo.findAll();
		return all;
	}
	//Get single Book by Id
	public Book getBook(int id)
	{
		Book book=null;
		try {
			book=this.bookRepo.findById(id);
			
		} catch (Exception e2) {
		
			e2.printStackTrace();
		}
		
		return book;
	}
	//Add Book in the List
	public Book addBook(Book b)
	{
		Book res=this.bookRepo.save(b);
		return res;
	}

	//Delete book by Id
	public void deleteBook(int id) {
		this.bookRepo.deleteById(id);
		
	}
		//Update Book
		public void updateBook(Book book, int id) {
			book.setId(id);
			bookRepo.save(book);
			
		}
	
}
