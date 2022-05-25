package com.learning.creationalDesignPattern.singleton.multipleInstance;

public class MultipleSingletonInstance {
	private static MultipleSingletonInstance[] multiInstance = new MultipleSingletonInstance[5];
	private static int counter = 0;
	static {
		for (int i=0; i<5; i++) {
			multiInstance[i] = new MultipleSingletonInstance();
		}
	}
	
	private MultipleSingletonInstance() {
		
	}
	
	public static MultipleSingletonInstance getInstance() {
		if (counter == 5) {
			counter = 0;
		}
		return multiInstance[counter++];
	}
}
