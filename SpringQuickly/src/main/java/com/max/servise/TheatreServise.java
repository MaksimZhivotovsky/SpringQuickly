package com.max.servise;

import com.max.model.Actor;
import com.max.model.Performance;

public class TheatreServise implements Performance {

	private Actor actor;
	
	public TheatreServise(Actor actor) {
		this.actor = actor;
	}
	
	@Override
	public void carried() {
		System.out.println("Theatre started and play " + actor.getName());
	}

}
