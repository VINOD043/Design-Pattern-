package com.learning.creationalDesignPattern.factoryPattern.example2;

public class ComputerFactory {
	public static Computer buildComputer(String type, String ram, String hdd, String cpu) {
		if ("PC".equalsIgnoreCase(type)) {
			return new PC(ram, hdd, cpu);
		} else if ("SERVER".equalsIgnoreCase(type)) {
			return new Server(ram, hdd, cpu);
		} else {
			return null;
		}
	}
}
