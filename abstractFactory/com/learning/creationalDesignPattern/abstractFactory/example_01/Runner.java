package com.learning.creationalDesignPattern.abstractFactory.example_01;

public class Runner {

	public static void main(String[] args) {
		System.out.println(CarFactory.buildCar("USA", "SMALL"));
	    System.out.println(CarFactory.buildCar("USA","SEDAN"));
	    System.out.println(CarFactory.buildCar("USA","LUXARY"));
	    System.out.println("----------------------------------------");
	    System.out.println(CarFactory.buildCar("ASIA", "SMALL"));
	    System.out.println(CarFactory.buildCar("ASIA","SEDAN"));
	    System.out.println(CarFactory.buildCar("ASIA","LUXARY"));
	    System.out.println("----------------------------------------");
	    System.out.println(CarFactory.buildCar("Default", "SMALL"));
	    System.out.println(CarFactory.buildCar("Default","SEDAN"));
	    System.out.println(CarFactory.buildCar("Default","LUXARY"));
	}

}
