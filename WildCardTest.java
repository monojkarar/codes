package com.mac.java;

import java.util.ArrayList;
import java.util.List;

class Animal {
}

class Dog extends Animal {
}

class Bar {
	void doInsert(List<Object> list) {
		list.add(new Dog());
	}
}

public class WildCardTest {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		Bar bar = new Bar();
		// bar.doInsert(myList);
	}

}
