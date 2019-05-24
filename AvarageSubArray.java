package com.mac.java;

import java.util.Arrays;

/*
 * Given an array, find the average of all subarrays of size ‘K’ in it.
 * Array: [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
 */
public class AvarageSubArray {

	public static void main(String[] args) {
		int k = 5;
		int[] data = { 1, 3, 2, 6, -1, 4, 1, 8, 2 };
		double[] result = new double[(data.length - k) + 1];
		int windowEnd = 0, windowStart = 0;
		double windowSum = 0;
		while (windowEnd < data.length) {
			windowSum += data[windowEnd];
			if (windowEnd >= k - 1) {
				result[windowStart] = windowSum / k;
				windowSum = windowSum - data[windowStart++];
			}
			windowEnd++;
		}
		System.out.println(Arrays.toString(result));
	}

}
