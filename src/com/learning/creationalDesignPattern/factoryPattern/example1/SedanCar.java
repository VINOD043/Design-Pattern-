package com.learning.creationalDesignPattern.factoryPattern.example1;

public class SedanCar extends Car {

	SedanCar() {
		super(CarType.SEDAN);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("Building Sedan car.");
	}

}
