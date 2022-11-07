package com.max.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.max.model.LoginCountApplicationScope;
import com.max.model.LoginUserSessionScope;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {

	private final LoginUserSessionScope loginUserSessionScope;
	private final LoginCountApplicationScope loginCountApplicationScope;
	
	@GetMapping("/main")
	public String home(
			@RequestParam(required = false) String logout,
			Model model
			) {
		
		if(logout != null) {
			loginUserSessionScope.setUsername(null);
		}
		
		String username = loginUserSessionScope.getUsername();
		int count = loginCountApplicationScope.getCount();
		
		if(username == null) {
			return "redirect:/";
		}
		
		model.addAttribute("username", username);
		model.addAttribute("loginCount", count);
		return "main.html";
	}
}
