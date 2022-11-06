package com.max.model;

import org.springframework.stereotype.Component;

@Component
public class Author {

	private String name;
	private Book book;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Author [name=" + name + ", book=" + book + "]";
	}
}
