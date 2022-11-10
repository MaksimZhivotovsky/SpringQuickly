package com.max.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;

//@Data

public class Book {

	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String author;
	private BigDecimal pages;
	
	public Book() {}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public BigDecimal getPages() {
		return pages;
	}

	public void setPages(BigDecimal pages) {
		this.pages = pages;
	}
	
	
}