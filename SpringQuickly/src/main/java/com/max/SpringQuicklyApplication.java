package com.max;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.max.config.ProgectConfig;
import com.max.model.Author;
import com.max.model.Book;
import com.max.model.ConsumerParrol;
import com.max.model.Library;
import com.max.model.Parrol;

public class SpringQuicklyApplication {

	public static void main(String[] args) {

		var contex = new AnnotationConfigApplicationContext(ProgectConfig.class);
		
		Author author = contex.getBean("Достоевский Ф. М.", Author.class);
		Author author2 = contex.getBean("Брюс Экельс", Author.class);
		Parrol parrol = contex.getBean("KIKI", Parrol.class);
		Book book = contex.getBean("Идиот",Book.class);
		Book book2 = contex.getBean("Мертвые души", Book.class);
		Book book3 = new Book("Мастер и Маргарита", author);
		Book book4 = contex.getBean("Философия Java", Book.class);
		Book book5 = contex.getBean("Философия Java1", Book.class);
		Library library = contex.getBean("library", Library.class);
		ConsumerParrol consumerParrol = contex.getBean("consumerKESHA", ConsumerParrol.class);
		
		library.setName("Библиотека имени Пирогова");
		library.setBook(book3);
		
		System.out.println(parrol);
		System.out.println(book);
		System.out.println(book2);
		System.out.println(book3);
		System.out.println(book4);
		System.out.println(author2);
		System.out.println(book5);
		System.out.println(library);
		System.out.println(consumerParrol);
	}
}
