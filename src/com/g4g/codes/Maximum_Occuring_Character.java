package com.g4g.codes;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ankit Tomar
 */
public class Maximum_Occuring_Character {

	public static Character getMaximumOccuringCharacter(String str) {
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			Character character = str.charAt(i);
			if (!charCount.containsKey(character)) {
				charCount.put(character, 1);
			} else {
				charCount.put(character, charCount.get(character) + 1);
			}
		}
		Integer max = -1;
		Character maxOccuringCharacter = null;
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if (entry.getValue() > max) {
				max = entry.getValue();
				maxOccuringCharacter = entry.getKey();
			}
		}
		return maxOccuringCharacter;
	}

	public static void main(String[] args) {

		String str = "sample string";
		System.out.println("Max occurring character is "
				+ getMaximumOccuringCharacter(str));
	}

}
