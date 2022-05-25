package com.learning.creationalDesignPattern.factoryPattern.example1;

public class LuxaryCar extends Car {
	
	public LuxaryCar() {
		super(CarType.LUXARY);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("Building Luxary car.");
	}

}
