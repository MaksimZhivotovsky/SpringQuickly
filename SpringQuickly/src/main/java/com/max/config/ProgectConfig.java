package com.max.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

import com.max.aspect.LoggAspect;
import com.max.model.Action;
import com.max.model.Actor;
import com.max.model.Author;
import com.max.model.Book;
import com.max.model.Performance;
import com.max.servise.FilmServise;
import com.max.servise.TheatreServise;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com")
public class ProgectConfig {

	@Bean(name = "Поречинков")
	Actor actor() {
		var actor = new Actor();
		actor.setName("Поречинков");
		return actor;
	}
	
	@Bean(name = "film")
	Performance film() {
		return new FilmServise(actor());
	}
	
	@Bean(name = "theatre")
	Performance theatre() {
		return new TheatreServise(actor());
	}
	
	@Bean(name = "actionFilm")
	Action actionFilm(@Qualifier("film") Performance performance) {
		return new Action(performance);
	}
	
	@Bean(name = "actionTheatre")
	Action actionTheatre(@Qualifier("theatre") Performance performance) {
		return new Action(performance);
	}
	@Bean(name = "Достоевский")
	@Scope(BeanDefinition.SCOPE_PROTOTYPE)
	Author author() {
		var author = new Author();
		author.setName("Достоевский");
		author.setBook(new Book("Идиот"));
		return author;
	}

}

