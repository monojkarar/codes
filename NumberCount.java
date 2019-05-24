package com.mac.java;

public class NumberCount {

	public static int getCount(int[] a, int low, int high, int x) {
		System.out.println("Low : " + low + ", High : " + high);
		if (low >= high) {
			return -1;
		}
		int mid = (high + low) / 2;
		if (x > a[mid]) {
			return getCount(a, mid + 1, high, x);
		} else if (x < a[mid]) {
			return getCount(a, low, mid, x);
		}
		return mid;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 2, 7, 8, 9 };
		System.out.println(getCount(a, 0, a.length, 7));
	}

}
