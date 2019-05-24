package com.mac.java;

public class FindMaximumInSlidingWindow {

	public static void main(String[] args) {
		int[] data = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	    int[] data = { 10, 6, 9, -3, 23, -1, 34, 56, 67, -1, -4, -8, -2, 9, 10, 34, 67 };
		
		int w = 3;
		int[] result = new int[(data.length - w) +1]; 
		int startWindow = 0, endWindow = 0, windowMax = Integer.MIN_VALUE;
		while (endWindow < data.length) {
			if (((endWindow + 1) % w) == 0) {
				System.out.println(windowMax);
				
				
			} else {
				windowMax = Math.min(windowMax, data[endWindow]);
				endWindow++;
			}
			
		}
//		System.out.println(3 % 3);

	}

}
