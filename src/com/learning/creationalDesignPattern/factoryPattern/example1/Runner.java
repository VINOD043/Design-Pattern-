package com.learning.creationalDesignPattern.factoryPattern.example1;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Enter car model : LUXARY, SEDAN, SMALL");
		Scanner scan = new Scanner(System.in);
		String model = scan.next();
		CarFactory.buildCar(model);
		scan.close();
	}

}
