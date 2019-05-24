package com.mac.java;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		System.out.println("Stack data after populating : " + stack);
		System.out.println("Stack peek() executed and provides last element from the stack : " + stack.peek());
		System.out.println("Stack pop() executed and removed the last element from the stack : " + stack.pop());
		System.out.println("Stack search executed and returned the index : " + stack.search(30));
		System.out.println("Stack search executed and returned the index : " + stack.search(60));
		System.out.println(stack);
		
	}

}
