package com.learning.creationalDesignPattern.abstractFactory.example_02;

public class ServerFactory implements ComputerAbstractFactory {

	private String ram;
	private String hdd;
	private String cpu;
	
	ServerFactory(String ram, String hdd, String cpu) {
		System.out.println("Creating PCFactory object");
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	
	@Override
	public Computer createComputer() {
		System.out.println("Creating PC");
		return new Server(ram, hdd, cpu);
	}

}
