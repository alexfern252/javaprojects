package com.haripadisetti.java8;


interface Sayable{
	
	void say();
}

public class MethodReferenceTest {
	
	public static void saySomething() {
		
		System.out.println(" Hello, this is static method");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Method reference in java 8");
		
		
		//Using  Method reference
		Sayable sayable = MethodReferenceTest::saySomething;
		sayable.say();
	  // Using lambda expression
		Sayable sayble2 = () -> System.out.println("Lambda expression in java 8");
		sayble2.say();
		
		
		
	}
}
