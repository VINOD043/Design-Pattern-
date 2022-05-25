package com.learning.creationalDesignPattern.abstractFactory.example_01;

public abstract class Car {
	private CarType model = null;
	private Location location;
	
	Car(CarType model, Location location) {
		this.model = model;
		this.location = location;
	}
	
	public abstract void construct();
	
	@Override
	public String toString() {
		return "Model : "+model+" built in : "+location;
	}
}
