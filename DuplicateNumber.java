package com.mac.java.test;

import java.util.Hashtable;

public class DuplicateNumber {

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		int n = a.length, i = 0, result=0;
		Hashtable<Integer, Integer> counts = new Hashtable<Integer, Integer>(n);
		while ( i < n) {
			if (counts.get(a[i]) == null) {
				counts.put(a[i], 1);
			} else {
				result = a[i];
				break;
			}
            i++;
		}
		System.out.println(result);
		
	}

}
