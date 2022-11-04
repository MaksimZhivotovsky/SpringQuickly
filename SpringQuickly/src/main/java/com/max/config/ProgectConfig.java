package com.max.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.max.model.Book;
import com.max.model.Parrol;

@Configuration
@ComponentScan("com")
public class ProgectConfig {

	@Bean
	Parrol parrol() {
		var parrol = new Parrol();
		parrol.setName("KESHA");
		return parrol;
	}
	
	@Bean(name = "Мертвые души")
	Book book() {
		var book = new Book();
		book.setAuthor("Достоевский Ф.М.");
		book.setName("Мертвые души");
		return book;
	}
	
	@Bean(name = "Идиот")
	@Primary
	Book book1() {
		var book = new Book();
		book.setAuthor("Достоевский Ф.М.");
		book.setName("Идиот");
		return book;
	}
}
