package com.max.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.ApplicationScope;

@Component
@ApplicationScope
public class LoginCountApplicationScope {

	private int count;
	
	public void incriment() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
}
