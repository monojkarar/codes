package com.mac.java;

import java.util.ArrayList;
import java.util.List;

public class RetainAllTest {

	public static void main(String[] args) {
		
		List<Integer> data1 = new ArrayList<>();
		data1.add(1);
		data1.add(2);
		data1.add(3);
		data1.add(4);
		data1.add(6);
		data1.add(7);
		data1.add(8);
		data1.add(9);
		
		List<Integer> data2 = new ArrayList<>();
		data2.add(1);
		data2.add(2);
		data2.add(3);
		data2.add(5);
		
		System.out.println(data1);
		System.out.println(data2);
		
		data1.retainAll(data2);
		
		System.out.println(data1);
		System.out.println(data2);
		
		
	}

}
