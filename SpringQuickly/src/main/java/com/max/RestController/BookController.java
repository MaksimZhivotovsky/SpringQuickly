package com.max.RestController;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.max.model.Book;

@RestController
@RequestMapping("/books")
public class BookController {

	@GetMapping("/idiot")
	public Book idiot() {
		Book book = Book.of("Идиот", "Достоевский Ф. М.");
		return book;
	}
	
	@GetMapping("/doctor")
	public ResponseEntity<Book> doctor() {
		Book book = Book.of("Записки юного врача", "Достоевский Ф. М.");
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("качество книги", "высокое");
//		headers.add("категории потребителей", "все");
//		return new ResponseEntity(book, headers, HttpStatus.ACCEPTED);
		
//		return ResponseEntity.ok()
//				.header("качество книги", "высокое")
//				.body(book);
		
//		return ResponseEntity
//				.status(HttpStatus.ACCEPTED)
//				.header("качество книги", "высокое")
//				.header("категории потребителей", "все")
//				.body(book);
		
		return new ResponseEntity(book, HttpStatus.ACCEPTED);

	}
}
