package com.mac.java;

/*
 * Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any subarray of size ‘k’.
 * 
 * Example 1: 
	Input: [2, 1, 5, 1, 3, 2], k=3 
	Output: 9
	Explanation: Subarray with maximum sum is [5, 1, 3].
	
Example 2:
	Input: [2, 3, 4, 1, 5], k=2 
	Output: 7
	Explanation: Subarray with maximum sum is [3, 4].
 *
 */
public class MaximumSumOfSubArray {

	public static void main(String[] args) {
//		int[] data = { 2, 3, 4, 1, 5 };
//		int k = 2;
		int[] data = { 2, 1, 5, 1, 3, 2 };
		int k = 3;
		int windowStart = 0, windowEnd = 0, windowSum = 0, max = 0;

		while (windowEnd < data.length) {
			windowSum += data[windowEnd];
			if ((windowEnd - windowStart) >= k - 1) {
				if (max < windowSum) {
					max = windowSum;
				}
				windowSum = windowSum - data[windowStart];
				windowStart++;
			}
			windowEnd++;
		}
		System.out.println(max);

	}

}
