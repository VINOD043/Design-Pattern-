package com.learning.creationalDesignPattern.abstractFactory.example_02;

public class Runner {

	public static void main(String[] args) {
		Computer computer = ComputerFactory.buildComputer(new PCFactory("4 GB", "500 GB", "2.4 GHz"));
		System.out.println("Computer : "+computer);
	}

}
