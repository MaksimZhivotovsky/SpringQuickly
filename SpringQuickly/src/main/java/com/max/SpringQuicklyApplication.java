package com.max;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.max.config.ProgectConfig;
import com.max.model.Book;
import com.max.model.Parrol;

public class SpringQuicklyApplication {

	public static void main(String[] args) {

		var contex = new AnnotationConfigApplicationContext(ProgectConfig.class);
		
		Parrol parrol = contex.getBean(Parrol.class);
		Book book = contex.getBean(Book.class);
		Book book2 = contex.getBean("Мертвые души", Book.class);
		Book book3 = new Book("Собачье сердце", "Достоевский Ф.М.");
		
		System.out.println(parrol);
		System.out.println(book);
		System.out.println(book2);
		System.out.println(book3);
	}

}
