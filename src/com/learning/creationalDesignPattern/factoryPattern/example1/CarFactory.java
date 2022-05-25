package com.learning.creationalDesignPattern.factoryPattern.example1;

public class CarFactory {
	
	public static Car buildCar(String type) {
		Car car = null;
		if (CarType.LUXARY.toString().equalsIgnoreCase(type)) {
			car = new LuxaryCar();
		} else if (CarType.SEDAN.toString().equalsIgnoreCase(type)) {
			car = new SedanCar();
		} else if (CarType.SMALL.toString().equalsIgnoreCase(type)) {
			car = new SmallCar();
		} else {
			System.out.println("Choice didn't match.");
		}
		return car;
	}
}
