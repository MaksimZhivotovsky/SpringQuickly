package com.max.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.max.model.Author;
import com.max.model.Book;
import com.max.model.ConsumerParrol;
import com.max.model.Parrol;

@Configuration
@ComponentScan("com")
public class ProgectConfig {
	
	@Bean(name = "Достоевский Ф. М.")
	Author author() {
		var author = new Author();
		author.setName("Достоевский Ф. М.");
		return author;
	}

	@Bean(name = "KESHA")
//	@Primary
	Parrol parrol() {
		var parrol = new Parrol();
		parrol.setName("KESHA");
		return parrol;
	}
	
	@Bean(name = "consumerKESHA")
	ConsumerParrol consumerParrol(@Qualifier("KESHA") Parrol parroll) {
		var cp = new ConsumerParrol();
		cp.setName("I'am");
		cp.setParrol(parroll);
		return cp;
	}
	
	@Bean(name = "Мертвые души")
	Book book() {
		var book = new Book();
		book.setAuthor(author());
		book.setName("Мертвые души");
		return book;
	}
	
	@Bean(name = "Идиот")
	Book book1() {
		var book = new Book();
		book.setAuthor(author());
		book.setName("Идиот");
		return book;
	}
	
	@Bean(name = "Брюс Экельс")
	@Primary
	Author brys() {
		var brys = new Author();
		brys.setName("Брюс Экельс");
		return brys;
	}
	
	@Bean(name = "Философия Java")
	Book filosofi(@Qualifier("Брюс Экельс") Author brus) {
		var book = new Book();
		book.setName("Философия Java");
		book.setAuthor(brus);
		return book;
	}
	@Bean(name = "Философия Java1")
	Book filosofi1(Author brus) {
		var book = new Book();
		book.setName("Философия Java1");
		book.setAuthor(brus);
		return book;
	}
}
