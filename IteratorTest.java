package com.mac.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) {
		List<Integer> data = new ArrayList<>();
		data.add(100);
		data.add(200);
		data.add(300);
		data.add(400);
		data.add(500);
		data.add(600);
		data.add(700);
		data.add(800);
		data.add(900);
		System.out.println("Before Removing 200 using Iterator : " + data);
		Iterator<Integer> dataIterator = data.iterator();
		while (dataIterator.hasNext()) {
			int d = dataIterator.next();
			if(d == 200) {
				dataIterator.remove();
				//data.add(1000);
			}
		}
		System.out.println("After Removing 200 using Iterator : " + data);
	}

}
