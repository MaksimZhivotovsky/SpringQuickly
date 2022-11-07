package com.max.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.max.model.Book;

@Service
public class BookService {

	private List<Book> books = new ArrayList<Book>();
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public List<Book> findAllBooks() {
		return books;
	}
}
