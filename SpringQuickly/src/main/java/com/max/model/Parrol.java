package com.max.model;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class Parrol {

	private String name;

	@PostConstruct
	public void init() {
		this.name = "KIKI";
	}
	
	public Parrol() {}
	
	public Parrol(String name) {
		super();
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Parrol [name=" + name + "]";
	}
	
}
