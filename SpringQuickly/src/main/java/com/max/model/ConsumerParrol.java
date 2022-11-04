package com.max.model;

import org.springframework.stereotype.Component;

@Component
public class ConsumerParrol {

	private String name;
	private Parrol parrol;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Parrol getParrol() {
		return parrol;
	}
	public void setParrol(Parrol parrol) {
		this.parrol = parrol;
	}
	@Override
	public String toString() {
		return "ConsumerParrol [name=" + name + ", parrol=" + parrol + "]";
	}
	
	
}
