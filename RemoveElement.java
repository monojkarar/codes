package com.mac.java.test;

import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 2, 3, 0, 4, 2 }; int val=2;
		int n = a.length, i = 0, j = n - 1, count = 0;
		boolean valFound = false;
		if (n == 1 && a[i] != val) {
			i = n;
		} else if (n == 1 && a[i] == val) {
			i = 0;
			valFound = true;
		}
		while (i < j) {
			while (i < j && a[i] != val) {
				i++;
			}

			while (i < j && a[j] == val) {
				j--;
			}
			if (i < j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		if (i == n-1 && !valFound && a[i]!=val) {
			i = n;
		}
		System.out.println(Arrays.toString(a));
	}

}
