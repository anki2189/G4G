package com.g4g.codes;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ankit Tomar
 */

public class Remove_Duplicate_Characters_From_String {

	public static String removeDuplicateCharactersFromString(String str) {
		Map<Character, Boolean> characterSeen = new HashMap<Character, Boolean>();

		StringBuilder uniqueCharacterString = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			Character character = str.charAt(i);
			if (!characterSeen.containsKey(character)) {
				uniqueCharacterString.append(character);
			}
			characterSeen.put(character, true);
		}
		return uniqueCharacterString.toString();
	}

	public static void main(String[] args) {
		String str = "geeksforgeeks";
		System.out.println("String Without duplicate Character : "
				+ removeDuplicateCharactersFromString(str));
		;
	}
}
