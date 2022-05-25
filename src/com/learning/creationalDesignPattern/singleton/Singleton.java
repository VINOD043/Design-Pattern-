package com.learning.creationalDesignPattern.singleton;

public class Singleton {
	private static Singleton singletonInstance = null;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if (null == singletonInstance) {
			singletonInstance = new Singleton();
		}
		return singletonInstance;
	}
}
