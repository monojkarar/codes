package com.mac.java;

public class StringConstruction {

	public static void main(String[] args) {
		String s = "abab";
		if (s.length() > 0) {
			final int UPPER_LIMIT = 97;
			int count = 0;
			int[] data = new int[26];
			char[] ch = s.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if(data[ch[i] - UPPER_LIMIT] == 0) {
					data[ch[i] - UPPER_LIMIT] = data[ch[i] - UPPER_LIMIT] + 1;
					count++;
				}
			}
			System.out.println(count);
		}
	}

}
