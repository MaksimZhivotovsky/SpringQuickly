package com.max.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.max.error.AccountNotFoundException;
import com.max.model.Book;
import com.max.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TransferService {

	private final BookRepository bookRepository;
	
	@Transactional
	public void transferPages(long idSender, long idRecever, BigDecimal pages) {
		Book sender = bookRepository.findById(idSender)
				.orElseThrow(() -> new AccountNotFoundException());
		Book receiver = bookRepository.findById(idRecever)
				.orElseThrow(() -> new AccountNotFoundException());;
		
		BigDecimal senderNewPages = sender.getPages().subtract(pages);
		BigDecimal receiverNewPages = receiver.getPages().add(pages);
		
		bookRepository.changePages(idSender, senderNewPages);
		bookRepository.changePages(idRecever, receiverNewPages);
	
//		throw new RuntimeException("Oh no! Something went wrong!");
		
	}
	
	public Iterable<Book> getAllBooks() {
		return bookRepository.findAll();
	}
	
//	public List<Book> findBooksByName(String name) {
//		return bookRepository.findBookByName(name);
//	}
}
