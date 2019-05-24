package com.mac.java;

public class CeasarCipher {

	public static void main(String[] args) {
//		System.out.println(ceasarCipher("Zoo Keeper", 2));
//		System.out.println(ceasarCipher("Bqq Mggrgt", -2));
		
//		System.out.println(ceasarCipher("A Zoo Keeper", -2));
		
		System.out.println(ceasarCipher("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 23));
		
	}

	private static String ceasarCipher(String data, int num) {
		StringBuilder sb = new StringBuilder();
		if (num == 0)
			return data;

		for (int index = 0; index < data.length(); index++) {
			if (data.charAt(index) == ' ') {
				sb.append(data.charAt(index));
				continue;
			}

			int asciiValue = Integer.valueOf(data.charAt(index));
			if(asciiValue >= 97 && asciiValue <= 122) {
				asciiValue += num;
				if(asciiValue > 122) {
					asciiValue -= 26;
				} else if(asciiValue < 97) {
					asciiValue += 26;
				}
				sb.append((char) asciiValue);
			} else if(asciiValue >= 65 && asciiValue <= 90) {
				asciiValue += num;
				if(asciiValue > 90) {
					asciiValue -= 26;
				} else if(asciiValue < 65) {
					asciiValue += 26;
				}
				sb.append((char) asciiValue);
			}
		}
		return sb.toString();
	}

}
