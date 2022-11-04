package com.max.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.max.model.Action;
import com.max.model.Actor;
import com.max.model.Performance;
import com.max.servise.FilmServise;
import com.max.servise.TheatreServise;

@Configuration
public class ProgectConfig {

	@Bean
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

}

