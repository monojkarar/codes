package com.mac.java.naive.string.matching;

public class NaiveStringPatternMatching {

	public static void main(String[] args) {
		String text = "hi hello hi";
		String key = "hi";
		match(text, key);
	}

	private static void match(String text, String key) {
		boolean keyPresent = false;
		int i = 0;
		if (text.length() >= key.length()) {
			while (i <= text.length() - key.length() && !keyPresent) {
				int j = 0;
				while (j < key.length()) {
					if (text.charAt(i + j) != key.charAt(j)) {
						break;
					} else if ((j + 1) == key.length()) {
						keyPresent = true;
					}
					j++;
				}				
				i++;
			}
		}
		if (keyPresent) {
			System.out.println("Key = " + key + " found at index = " + i + ".");
		} else {
			System.out.println("Key " + key + " not found in text " + text);
		}
	}
}
