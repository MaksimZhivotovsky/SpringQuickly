package com.max.model;

import org.springframework.stereotype.Component;

@Component
public class Book {

	private String name;
	private String author;
	
	public static Book of(String name, String author) {
		Book book = new Book();
		book.setName(name);
		book.setAuthor(author);
		return book;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
}
