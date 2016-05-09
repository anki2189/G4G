package com.g4g.codes;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ankit Tomar
 */

public class Print_Duplicate_Characters_of_String {

	private static void printDuplicateCharacters(String str) {
		Map<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			Character character = str.charAt(i);
			if (!charCount.containsKey(character)) {
				charCount.put(character, 1);
			} else {
				charCount.put(character, charCount.get(character) + 1);
			}
		}

		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Count of " + entry.getKey() + " is "
						+ entry.getValue());
			}
		}
	}

	public static void main(String[] args) {
		String str = "test string";
		printDuplicateCharacters(str);
	}

}
