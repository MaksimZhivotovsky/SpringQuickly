package com.max.service;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.max.model.Book;
import com.max.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TransferService {

	private final BookRepository bookRepository;
	
	@Transactional
	public void transferPages(long idSender, long idRecever, BigDecimal am) {
		Book sender = bookRepository.findBookById(idSender);
		Book receiver = bookRepository.findBookById(idRecever);
		
		BigDecimal senderNewPages = sender.getPages().subtract(am);
		BigDecimal receiverNewPages = receiver.getPages().add(am);
		
		bookRepository.changePages(idSender, senderNewPages);
		bookRepository.changePages(idRecever, receiverNewPages);
	
//		throw new RuntimeException("Oh no! Something went wrong!");
	}
}
