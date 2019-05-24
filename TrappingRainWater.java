package com.mac.java;

public class TrappingRainWater {

	public static void main(String[] args) {
//		int[] data = { 2, 0, 2 }; // Output: 2
//		int[] data = { 3, 0, 0, 2, 0, 4 }; // Output: 10
		int[] data = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };// Output: 6

		int windowStart = 0, windowEnd = 0, windowSum = 0, startMax = 0, endMax = 0;

		while (windowEnd < data.length) {
			if (data[windowStart] == 0) {
				windowStart++;
			}
			if (data[windowStart] > data[windowEnd]) {
				windowSum = windowSum + (data[windowStart] - data[windowEnd]);
			}
			/*
			 * else { windowSum = windowSum + (data[windowEnd] - data[windowStart]); }
			 */
			windowEnd++;
		}
		System.out.println("Result : " + windowSum);
	}
}
