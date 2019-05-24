package com.mac.java.test;

public class MinMaxSum {

	public static void findMinMaxSum(int[] arr, int n) {
		long total = 0;
		for (int i = 0; i < n; i++) {
			total += arr[i];
		}
		long min = total, max = 0;
		for (int i = 0; i < n; i++) {
			if (total - arr[i] > max && total - arr[i] < total) {
				max = total - arr[i];
			}

			if (total - arr[i] < min) {
				min = total - arr[i];
			}
		}
		System.out.println(min + " " + max);
	}

	public static void main(String[] args) {
		// int[] arr = { 1, 3, 5, 7, 9 };
		int[] arr = { 256741038, 623958417, 467905213, 714532089, 938071625 };
		int n = 5;
		findMinMaxSum(arr, n);
	}
}
