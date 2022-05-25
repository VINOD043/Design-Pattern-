package com.learning.creationalDesignPattern.factoryPattern.example2;

import java.util.Scanner;

public class Runner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter choice : PC, SERVER");
		String type = scan.nextLine();
		scan.close();
		Computer computer = ComputerFactory.buildComputer(type, "4 GB", "500 GB", "2.5 Ghz");
		System.out.println(computer);
	}

}
