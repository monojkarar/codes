package com.mac.java;

public class Operations {
	{
		System.out.println("Inside Instance Block  of Operations");
	}
	static {
		System.out.println("Inside Static Block of Operations");
	}
	
	public Operations() {
		System.out.println("Inside Default Constructor of Operations");
	}

	public int sum(int a, int b) {
		return a + b;
	}

}
