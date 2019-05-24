package com.mac.java.searching;

public class BinarySearch {

	public static void main(String[] args) {

		int data[] = { -22, -15, 1, 7, 35, 55 };
		int val = 1;
		int start = 0, end = data.length;
		int index = -1;
		while (start < end) {
			int mid = (start + end) / 2;
			if (data[mid] == val) {
				index = mid;
				break;
			} else if (val < data[mid]) {
				end = mid;
			} else {
				start = mid + 1;
			}
		}
		if (index != -1) {
			System.out.println(val + " found at " + index + " index.");
		} else {
			System.out.println(val + " not found.");
		}
	}

}
