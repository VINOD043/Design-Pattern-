package com.learning.creationalDesignPattern.abstractFactory.example_01;

public class SmallCar extends Car{

	SmallCar(Location location) {
		super(CarType.SMALL, location);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("Building small car.");
	}

}
