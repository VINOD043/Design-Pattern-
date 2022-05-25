package com.learning.creationalDesignPattern.abstractFactory.example_01;

public class Sedan extends Car{

	Sedan(Location location) {
		super(CarType.SEDAN, location);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("Building Sedan car.");
	}

}
