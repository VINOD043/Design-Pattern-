package com.learning.creationalDesignPattern.abstractFactory.example_02;

public class ComputerFactory {
	public static Computer buildComputer(ComputerAbstractFactory factory) {
		return factory.createComputer();
	}
}
