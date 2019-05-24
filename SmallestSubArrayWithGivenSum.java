package com.mac.java;

/*
 * Given an array of positive numbers and a positive number ‘S’, 
 * find the length of the smallest subarray whose sum is greater than or equal to ‘S’. 
 * Return 0, if no such subarray exists.
 * 
 * 
 * Example 1:
	Input: [2, 1, 5, 2, 3, 2], S=7 
	Output: 2
	Explanation: The smallest subarray with a sum great than or equal to '7' is [5, 2].

   Example 2:

	Input: [2, 1, 5, 2, 8], S=7 
	Output: 1
	Explanation: The smallest subarray with a sum greater than or equal to '7' is [8].

  Example 3:
	Input: [3, 4, 1, 1, 6], S=8 
	Output: 3
	Explanation: Smallest subarrays with a sum greater than or equal to '8' are [3, 4, 1] or [1, 1, 6].
 * 
 * 
 * 
 */
public class SmallestSubArrayWithGivenSum {

	public static void main(String[] args) {
//		Example 1:
//		int[] data = { 2, 1, 5, 2, 3, 2 };
//		int s = 7;

//		Example 2:
//		int[] data = { 2, 1, 5, 2, 8 };
//		int s = 7;

//		Example 3:
		int[] data = { 3, 4, 1, 1, 6 };
		int s = 8;

		int windowStart = 0, windowEnd = 0, windowSum = 0, minLength = data.length;
		boolean matched = false;

		while (windowEnd < data.length) {
			windowSum += data[windowEnd];

			if (windowSum >= s) {
				minLength = Math.min(minLength, windowEnd - windowStart + 1);;
				matched = true;
				windowSum = windowSum - data[windowEnd] - data[windowStart];
				windowStart++;
			} else {
				windowEnd++;
			}
		}
		System.out.println(minLength);
	}

}
