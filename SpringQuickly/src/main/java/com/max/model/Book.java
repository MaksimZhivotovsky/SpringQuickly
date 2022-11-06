package com.max.model;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Book {

	private String name;
	
	public Book() {}

	public Book(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
