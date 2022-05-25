package com.learning.creationalDesignPattern.factoryPattern.example1;

public abstract class Car {
	private CarType model = null;
	
	Car(CarType model) {
		this.model = model;
	}
	
	public abstract void construct();

	public CarType getModel() {
		return model;
	}

	public void setModel(CarType model) {
		this.model = model;
	}
	
}
