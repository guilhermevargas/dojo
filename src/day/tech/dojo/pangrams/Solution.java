package day.tech.dojo.pangrams;

import java.util.HashSet;

public class Solution {
	public static String isPangram(String word) {
		if (word == null || word.isEmpty()) {
			return "not pangram";
		}

		char[] letters = word.toLowerCase().toCharArray();

		HashSet<Character> setAlphabet = new HashSet<Character>();

		for (char c : letters) {
			if (c != ' ') {
				setAlphabet.add(Character.valueOf(c));
			}
		}

		if (setAlphabet.size() == 26) {
			return "pangram";
		} else {
			return "not pangram";
		}
	}
}
