package com.g4g.codes;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ankit Tomar
 */

public class Remove_Characters_From_First_String_Which_Are_Present_In_Second {

	public static String removeCharacters(String first, String second) {
		Map<Character, Boolean> charToRemove = new HashMap<Character, Boolean>();
		StringBuilder result = new StringBuilder();

		for (int i = 0; i < second.length(); i++) {
			charToRemove.put(second.charAt(i), true);
		}

		for (int i = 0; i < first.length(); i++) {
			if (!charToRemove.containsKey(first.charAt(i))) {
				result.append(first.charAt(i));
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		String first = "geeksforgeeks";
		String second = "mask";
		System.out.println(removeCharacters(first, second));
	}
}
