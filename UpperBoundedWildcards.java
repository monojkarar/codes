package com.mac.java.generics.types1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Animal {

}

class Dog extends Animal {

}

class Bird {

}

class Crow extends Bird {
}


class Node<T> {

    public T data;

    public Node(T data) { this.data = data; }

    public void setData(T data) {
        System.out.println("Node.setData");
        this.data = data;
    }
}

class MyNode extends Node<Integer> {
    public MyNode(Integer data) { super(data); }

    public void setData(Integer data) {
        System.out.println("MyNode.setData");
        super.setData(data);
    }
}

public class UpperBoundedWildcards {

	static void foo(List<?> i) {
		fooHelper(i);
	}

	public static <T> int count(T[] anArray, T elem) {
	    int cnt = 0;
	    for (T e : anArray) {
	        if (e.equals(elem)) {
	            ++cnt;
	        }
	    }
	    return cnt;
	        
	}
	
	/*
	void swapFirst(List<? extends Number> l1, List<? extends Number> l2) {
		Number temp = l1.get(0);
		l1.set(0, l2.get(0)); // expected a CAP#1 extends Number, got a CAP#2 extends Number;
								// same bound, but different types
		l2.set(0, temp); // expected a CAP#1 extends Number, got a Number
	}
	*/

	// Helper method created so that the wildcard can be captured through type
	// inference.
	private static <T> void fooHelper(List<T> l) {
		l.set(0, l.get(0));
	}

	public static void main(String[] args) {
		List<Integer> intList = new ArrayList<>();
		List<? extends Integer> intUpList = intList;
		List<? extends Number> numList = intList;

		/*
		List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
		foo(data);
		*/
		
		/*
		Integer intArray[] = {1,2,3,4,5};
		System.out.println(count(intArray, 5));
		*/
		/*
		MyNode mn = new MyNode(5);
		Node n = mn;            // A raw type - compiler throws an unchecked warning
		n.setData("Hello");     
		Integer x = mn.data;    // Causes a ClassCastException to be thrown.
		*/
		
		List<String> stringListA = new ArrayList<String>();
	    List<String> stringListB = new ArrayList<String>();

	    ArrayBuilder.addToList(stringListA, "Seven", "Eight", "Nine");
	    ArrayBuilder.addToList(stringListB, "Ten", "Eleven", "Twelve");
	    List<List<String>> listOfStringLists = new ArrayList<List<String>>();
	    ArrayBuilder.addToList(listOfStringLists, stringListA, stringListB);
	    ArrayBuilder.faultyMethod(Arrays.asList("Hello!"), Arrays.asList("World!"));
		
	}
}

class ArrayBuilder {

	public static <T> void addToList(List<T> listArg, T... elements) {
		for (T x : elements) {
			listArg.add(x);
		}
	}

	public static void faultyMethod(List<String>... l) {
		Object[] objectArray = l; // Valid
		objectArray[0] = Arrays.asList(42);
		String s = l[0].get(0); // ClassCastException thrown here
	}

}