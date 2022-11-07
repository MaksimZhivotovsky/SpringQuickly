package com.max.test;

import org.springframework.stereotype.Component;

@Component
public class TestAspect {

	public TestAspect() {
		System.out.println("TestAspect");
	}

	public void test() {
		System.out.println("test");
	}
	
	@Override
	public String toString() {
		return "TestAspect []";
	}
	
}
