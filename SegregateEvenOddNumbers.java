package com.mac.java.test;

import java.util.Arrays;

public class SegregateEvenOddNumbers {

	public static void main(String[] args) {
		int[] a = { 12, 34, 45, 9, 8, 90, 3 };
		int n = a.length, i = 0, j = n - 1, evenCount = 0;

		while (i < j) {
			while (i < j && a[i] % 2 == 0) {
				evenCount++;
				i++;
			}
			while (i < j && a[j] % 2 != 0) {
				j--;
			}

			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		/*
		Next two line we can replace with actual sorting algorithm.
		But I am sure about any sorting with nlogn time complexity.
		I will update the below code with actual sorting algorithm,
		once I have clear understanding about nlogn based sorting.
		*/  
		Arrays.parallelSort(a, 0, evenCount);
		Arrays.parallelSort(a, evenCount, n);
		
		i = 0;
		while (i < n) {
			System.out.println(a[i]);
			i++;
		}
	}

}
