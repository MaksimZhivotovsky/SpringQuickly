package com.max.model;

public class Action {
	
	public Action(Performance performance) {
		performance.carried();
	}

	@Override
	public String toString() {
		return "Action [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
