package com.mac.java;

import java.util.Arrays;

public class VowelRemove {

//	Input : welcome to geeksforgeeks
//	Output : wlcm t gksfrgks
//
//	Input : what is your name ?
//	Output : wht s yr nm ?
	public static void main(String[] args) {
		String s = "welcome to geeksforgeeks";
		char[] ch = s.toCharArray();
		char a = 'a', e = 'e', i = 'i', o = 'o', u = 'u';
		int l = 0;
		while (l < ch.length) {
			if (ch[l] == a || ch[l] == e || ch[l] == i || ch[l] == o || ch[l] == u) {
				int j = l;
				while (j < ch.length - 1) {
					ch[j] = ch[j + 1];
					j++;
				}
				ch[j] = ' ';
				continue;
			}

			l++;
		}

		l = ch.length - 1;
		int count = 0;
		while (l >= 0) {
			if (ch[l] >= 97) {
				break;
			}
			l--;
		}
		System.out.println(Arrays.toString(ch));
		System.out.println(ch.length + " -> " + count);
		char[] newArray = new char[l + 1];
		int j = 0;
		while (j <= l) {
			newArray[j] = ch[j];
			j++;
		}
		System.out.println(Arrays.toString(newArray));
	}

}
