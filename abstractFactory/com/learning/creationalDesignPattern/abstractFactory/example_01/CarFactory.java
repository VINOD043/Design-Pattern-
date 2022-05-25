package com.learning.creationalDesignPattern.abstractFactory.example_01;

import java.util.Objects;

public class CarFactory {
	public static Car buildCar(String location, String carType) {
		Car car = null;
		if (!Objects.isNull(location)) {
			if (Location.USA.toString().equalsIgnoreCase(location)) {
				car = USACarFactory.buildCar(carType);
			} else if (Location.ASIA.toString().equalsIgnoreCase(location)) {
				car = AsiaCarFactory.buildCar(carType);
			} else {
				car = DefaultCarFactory.buildCar(carType);
			}
		}
		return car;
	}
}
