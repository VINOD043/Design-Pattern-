package com.learning.creationalDesignPattern.abstractFactory.example_01;

import java.util.Objects;

public class DefaultCarFactory {
	public static Car buildCar(String type) {
		Car car = null;
		if (!Objects.isNull(type)) {
			if (CarType.LUXARY.toString().equalsIgnoreCase(type)) {
				car = new Luxary(Location.DEFAULT);
			} else if (CarType.SEDAN.toString().equalsIgnoreCase(type)) {
				car = new Sedan(Location.DEFAULT);
			} else if (CarType.SMALL.toString().equalsIgnoreCase(type)){
				car = new SmallCar(Location.DEFAULT);
			}
		}
		return car;
	}
	
}
