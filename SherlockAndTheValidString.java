package com.mac.java;

import java.util.Arrays;

public class SherlockAndTheValidString {

	public static void main(String[] args) {

//		String s = "abc";
		String s = "abcc";
//		String s = "aabbcd"; //No
//		String s = "aabbccddeefghi"; //No
//		String s = "abcdefghhgfedecba"; //Yes
		int[] ref = new int[26];
		final int MAX = 97;

		for (int i = 0; i < s.length(); i++) {
			ref[s.charAt(i) - MAX] = ref[s.charAt(i) - MAX] + 1;
		}

//		System.out.println(Arrays.toString(ref));
		boolean valid = true;
		for (int i = 0; i < s.length(); i++) {
			if (ref[i] > 1) {
				valid = false;
				break;
			}
		}
		System.out.println(valid);

	}

}
