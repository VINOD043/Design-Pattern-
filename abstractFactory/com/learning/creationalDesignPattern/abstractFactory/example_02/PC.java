package com.learning.creationalDesignPattern.abstractFactory.example_02;

public class PC extends Computer {
	private String ram;
	private String hdd;
	private String cpu;
	
	public PC(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		System.out.println("PC created.");
	}

	@Override
	public String getRAM() {
		return this.ram;
	}

	@Override
	public String getHDD() {
		return this.hdd;
	}

	@Override
	public String getCPU() {
		return this.cpu;
	}

}
