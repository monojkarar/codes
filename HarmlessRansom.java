package com.mac.java;

import java.util.HashMap;
import java.util.Map;

public class HarmlessRansom {

	public static void main(String[] args) {
		String noteText = "this is a secret note for you from a secret admirer";
		String magazineText = "puerto rico is a place of great wonder and excitement it has many secret waterfall locatoins that i am an admirer of you must hike quite a distance to find the secret places as they are far from populated areas but it is worth the effort a tip i have for you is to go early in the morning when it is not so hot out also note that you must wear hiking boots this is one of the best places i have ever visited";

		System.out.println(harmlessRansomNote(noteText, magazineText));
	}

	private static boolean harmlessRansomNote(String noteText, String magazineText) {
		boolean isHarmlessRansomNote = true;
		Map<String, Integer> magazineTextMap = new HashMap<>();
		for (String text : magazineText.split(" ")) {
			if (!magazineTextMap.containsKey(text)) {
				magazineTextMap.put(text, 0);
			} 
			magazineTextMap.put(text, magazineTextMap.get(text) + 1);
		}
		
		for(String text : noteText.split(" ")) {
			if(magazineTextMap.get(text) > 0) {
				magazineTextMap.put(text, magazineTextMap.get(text) - 1);
			} else {
				isHarmlessRansomNote = false;
			}
		}
		
		return isHarmlessRansomNote;
	}

}
