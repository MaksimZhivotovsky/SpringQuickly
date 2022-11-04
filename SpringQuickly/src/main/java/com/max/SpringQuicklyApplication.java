package com.max;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.max.config.ProgectConfig;
import com.max.model.Action;
import com.max.model.Actor;
import com.max.servise.FilmServise;
import com.max.servise.TheatreServise;

public class SpringQuicklyApplication {

	public static void main(String[] args) {

		Action action = new Action(new FilmServise(new Actor("Гоцман")));
		Action action2 = new Action(new TheatreServise(new Actor("Mixa")));
		
		var contex = new AnnotationConfigApplicationContext(ProgectConfig.class);
		
		System.out.println();
		System.out.println();
		
		Action film = contex.getBean("actionFilm", Action.class);
		Action theatre = contex.getBean("actionTheatre", Action.class);
		
//		System.out.println(film);
//		System.out.println(theatre);
	}
}
