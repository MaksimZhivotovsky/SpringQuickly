package com.max.servise;

import org.springframework.stereotype.Service;

import com.max.model.Actor;
import com.max.model.Performance;

@Service
public class FilmServise implements Performance {

	private Actor actor;
	
	public FilmServise(Actor actor) {
		this.actor = actor;
	}
	
	@Override
	public void carried() {
		System.out.println("Film started and play " + actor.getName());
	}

	public Actor getActor() {
		return actor;
	}

}
