package com.mac.java;

import java.util.HashMap;
import java.util.Map;

/*
 * Given a string, find the length of the longest substring in it with no more than K distinct characters.
 * 
Example 1:
	Input: String="araaci", K=2
	Output: 4
	Explanation: The longest substring with no more than '2' distinct characters is "araa".

Example 2:
	Input: String="araaci", K=1
	Output: 2
	Explanation: The longest substring with no more than '1' distinct characters is "aa".
	
Example 3:
	Input: String="cbbebi", K=3
	Output: 5
	Explanation: The longest substrings with no more than '3' distinct characters are "cbbeb" & "bbebi".
*/
public class LongestSubstring {

	public static void main(String[] args) {
//		String data = "araaci";
//		int k = 2;
//		String data = "araaci";
//		int k = 1;
		String data = "cbbebi";
		int k = 3;

		int windowStart = 0, windowEnd = 0, max = 0, count = 0;

		Map<Character, Integer> distinctCharacterDetails = new HashMap<Character, Integer>();

		while (windowEnd < data.length()) {
			if (distinctCharacterDetails.size() <= k) {
				if (distinctCharacterDetails.get(data.charAt(windowEnd)) == null) {
					distinctCharacterDetails.put(data.charAt(windowEnd), 1);
				} else {
					distinctCharacterDetails.put(data.charAt(windowEnd),
							distinctCharacterDetails.get(data.charAt(windowEnd)) + 1);
				}
				count++;
				windowEnd++;
			} else {
				count--;
				if (max < count) {
					max = count;
				}
				if (distinctCharacterDetails.get(data.charAt(windowStart)) != null
						&& distinctCharacterDetails.get(data.charAt(windowStart)) - 1 == 0) {
					distinctCharacterDetails.remove(data.charAt(windowStart));
					
				}
				if (distinctCharacterDetails.get(data.charAt(windowStart)) != null) {
					distinctCharacterDetails.put(data.charAt(windowStart),
							distinctCharacterDetails.get(data.charAt(windowStart)) - 1);
				}
				windowStart++;
			}
		}
		System.out.println(max);
	}

}
