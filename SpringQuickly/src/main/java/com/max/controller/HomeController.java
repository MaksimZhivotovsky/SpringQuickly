package com.max.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

//	http://localhost:8080/home
//	@RequestMapping("/home")
//	public String home(Model model) {
//		model.addAttribute("username", "Max");
//		model.addAttribute("color", "red");
//		return "home.html";
//	}
//	
//	http://localhost:8080/home?username=Max&color=red
//	http://localhost:8080/home?color=red&username=Max
//	@RequestMapping("/home")
//	public String home(
//			@RequestParam(required = false) String username,
//			@RequestParam(required = false) String color,
//			Model model) {
//		model.addAttribute("username", username);
//		model.addAttribute("color", color);
//		return "home.html";
//	}
//	
//	http://localhost:8080/home/red
	@RequestMapping("/home/{color}")
	public String home(
			@PathVariable String color,
			Model model) {
		model.addAttribute("username", "Max");
		model.addAttribute("color", color);
		return "home.html";
	}
}
