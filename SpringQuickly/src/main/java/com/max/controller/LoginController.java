package com.max.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.max.model.LoginProcessor;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class LoginController {

	private final LoginProcessor loginProcessor;
	
	@GetMapping("/")
	public String loginGet() {
		return "login.html";
	}
	@PostMapping("/")
	public String loginPost(
			@RequestParam String username,
			@RequestParam String password, 
			Model model) {
		boolean loggenIn = false;
		
		loginProcessor.setUsername(username);
		loginProcessor.setPassword(password);
		loggenIn = loginProcessor.login();

		if(loggenIn) {
			return "redirect:/main";
		}
		
		model.addAttribute("message", "Login failed");
		return "login.html";
	}
}
