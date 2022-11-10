package com.max.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.max.model.Book;
import com.max.model.TransferRequest;
import com.max.repository.BookRepository;
import com.max.service.TransferService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

	private final BookRepository bookRepository;
	private final TransferService transferService;
	
	@PostMapping
	public void storeBook(@RequestBody Book book) {
		bookRepository.storeBook(book);
	}
	
	@GetMapping
	public List<Book> findBooks() {
		return bookRepository.findAllBooks();
	}
	
	@PostMapping("/transfer")
	public void transferPages(@RequestBody TransferRequest request) {
		transferService.transferPages(
				request.getSenderBookId(),
				request.getReceiverBookId(),
				request.getPages());
	}
}