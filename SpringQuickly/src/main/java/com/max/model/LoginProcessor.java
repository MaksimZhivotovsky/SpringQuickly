package com.max.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import lombok.RequiredArgsConstructor;

@Component
@RequestScope
@RequiredArgsConstructor
public class LoginProcessor {

	private final LoginUserSessionScope loginUserSessionScope;
	private final LoginCountApplicationScope loginCountApplicationScope;
	
	private String username;
	private String password;
	
	public boolean login() {
		loginCountApplicationScope.incriment();
		
		String username = this.username;
		String password = this.password;
		
		boolean loginResult = false;
		if("max".equals(username) && "1".equals(password)) {
			loginResult = true;
			loginUserSessionScope.setUsername(username);
		} 
		return loginResult;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
