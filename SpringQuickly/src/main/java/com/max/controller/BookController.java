package com.max.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.max.model.Book;
import com.max.service.BookService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BookController {

	private final BookService bookService;
	
	@RequestMapping("/books")
	public String viewBooks(Model model) {
		List<Book> books = bookService.findAllBooks();
		model.addAttribute("books", books);
		return "books.html";
	}
	
	@PostMapping("/books")
	public String addBook(Book book, Model model) {
		bookService.addBook(book);
		List<Book> books = bookService.findAllBooks();
		model.addAttribute("books", books);
		
		return "books.html";
	}
}
