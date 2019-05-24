package com.mac.java.recursion.problem;

public class RecursionImplementation {

	// Head Recursion
	public static void print(int arg) {
		if (arg == 0) {
			return;
		}
		print(arg - 1);
		System.out.println(arg);
	}

	// Tail Recursion
	public static void printReverse(int arg) {
		if (arg == 0) {
			return;
		}
		System.out.println(arg);
		printReverse(arg - 1);
	}
	
	public static int addIteratively(int num) {
		int result = 0;
		for (int i = 1; i <= num; i++) {
			result += i;
		}
		return result;
	}

	public static int addRecursively(int num) {
		if(num == 1) {
			return num;
		}
		return num + addRecursively(num - 1);
	}

	public static void main(String[] args) {
		print(5);
		System.out.println("********************************************");
		printReverse(5);
		System.out.println("********************************************");
		System.out.println(addIteratively(10));
		System.out.println("********************************************");
		System.out.println(addRecursively(5));
	}

}
