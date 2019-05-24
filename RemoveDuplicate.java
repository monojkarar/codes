package com.mac.java.test;

public class RemoveDuplicate {

	public static void main(String[] args) {
		int[] a = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int n = a.length, i = 1, count = 0, p = 1, temp = 0;
		if (n > 0) {
			temp = a[0];
			count = 1;
		}
		while (i < n) {
			if (a[i] != temp) {
				temp = a[i];
				int t = a[p];
				a[p] = a[i];
				a[i] = t;
				count++;
				p++;
			}
			i++;
		}
		i = 0;
		while (i < count) {
			System.out.println(a[i]);
			i++;
		}
	}

}
