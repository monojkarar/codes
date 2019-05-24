package com.mac.java;

/*
 * Write a program which return "fizz" if the number is a multiplier of 3.
 * Return "buzz" if its multiplier of 5.
 * Return "fizzbuzz" if the number is divisible by both 3 and 5. 
 * If the number is not divisible by either 3 or 5 then it should just return the number itself.
 */

public class FizzBuzz {

	private static void fizzBuzz(int num) {
		if (num < 1) {
			throw new RuntimeException("num parameter should atleast greater than 0.");
		}
		for (int i = 1; i <= num; i++) {
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		fizzBuzz(20);
	}

}
