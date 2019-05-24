package com.mac.java.generics.chapter1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Lists {
	public static <T> List<T> toList(T[] arr) {
		List<T> data = new ArrayList<T>();
		for (T t : arr) {
			data.add(t);
		}
		return data;
	}
}

public class GenericMethodsAndVargs {

	public static void main(String[] args) {
		List<Integer> data = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//		System.out.println(data);

		List<? extends Number> nums = new ArrayList<>();
		nums = data;
//		nums.addAll(data);
//		nums.add(1.2);
		for(Number number : nums) {
			System.out.println(number);
		}
	}

}
