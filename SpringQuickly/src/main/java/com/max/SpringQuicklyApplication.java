package com.max;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.max.config.ProgectConfig;
import com.max.model.Action;
import com.max.model.Actor;
import com.max.model.Author;
import com.max.servise.FilmServise;
import com.max.servise.TheatreServise;

public class SpringQuicklyApplication {

	public static void main(String[] args) {

		Action action = new Action(new FilmServise(new Actor("Гоцман")));
		Action action2 = new Action(new TheatreServise(new Actor("Mixa")));
		
		var contex = new AnnotationConfigApplicationContext(ProgectConfig.class);

		
		Action film = contex.getBean("actionFilm", Action.class);
		Action theatre = contex.getBean("actionTheatre", Action.class);
		
		FilmServise filmServise = contex.getBean(FilmServise.class);
		TheatreServise theatreServise = contex.getBean(TheatreServise.class);
		
		Author actor = contex.getBean(Author.class);
		Author author = contex.getBean(Author.class);
		
		System.out.println(filmServise.getActor().equals(theatreServise.getActor()));
		System.out.println(actor.equals(author));
	}
}
