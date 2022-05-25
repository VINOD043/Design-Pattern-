package com.learning.creationalDesignPattern.singleton.multipleInstance;

import com.learning.creationalDesignPattern.singleton.Singleton;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Application started : ");
		
		MultipleSingletonInstance instance1 = MultipleSingletonInstance.getInstance();
		System.out.println("instance : "+instance1.hashCode());
		
		MultipleSingletonInstance instance2 = MultipleSingletonInstance.getInstance();
		System.out.println("instance : "+instance2.hashCode());
		
		MultipleSingletonInstance instance3 = MultipleSingletonInstance.getInstance();
		System.out.println("instance : "+instance3.hashCode());
		
		MultipleSingletonInstance instance4 = MultipleSingletonInstance.getInstance();
		System.out.println("instance : "+instance4.hashCode());
		
		MultipleSingletonInstance instance5 = MultipleSingletonInstance.getInstance();
		System.out.println("instance : "+instance5.hashCode());
		
		MultipleSingletonInstance instance6 = MultipleSingletonInstance.getInstance();
		System.out.println("instance : "+instance6.hashCode());
		
		MultipleSingletonInstance instance7 = MultipleSingletonInstance.getInstance();
		System.out.println("instance : "+instance7.hashCode());
		
		System.out.println("Application End : ");
	}

}
