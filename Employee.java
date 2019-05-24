package com.mac.java.generics.types1;

public class Employee {
	
	static {
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Instance Block");
	}
	
	Employee(){
		System.out.println("Constructor");
	}
}
