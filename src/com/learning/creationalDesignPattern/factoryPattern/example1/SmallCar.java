package com.learning.creationalDesignPattern.factoryPattern.example1;

public class SmallCar extends Car{
	
	SmallCar() {
		super(CarType.SMALL);
		construct();
	}

	@Override
	public void construct() {
		System.out.println("Building small car.");
	}

}
