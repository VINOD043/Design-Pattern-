package com.learning.creationalDesignPattern.abstractFactory.example_01;

public class Luxary extends Car{

	Luxary(Location location) {
		super(CarType.LUXARY, location);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("Building Luxary car.");
	}
	
}
