package com.max.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Book {

	private long id;
	private String name;
	private String author;
	private BigDecimal pages;
}