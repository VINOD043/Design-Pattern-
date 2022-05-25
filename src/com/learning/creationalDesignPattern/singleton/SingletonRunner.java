package com.learning.creationalDesignPattern.singleton;

public class SingletonRunner {

	public static void main(String[] args) {
		System.out.println("Application started:");
		Singleton instance1 = Singleton.getInstance();
		System.out.println("instance : "+instance1.hashCode());
		
		Singleton instance2 = Singleton.getInstance();
		System.out.println("instance : "+instance2.hashCode());
	}

}
