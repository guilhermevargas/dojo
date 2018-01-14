package day.tech.dojo.marsexploration;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();

		int count = 0;

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) != "SOS".charAt(i % 3)) {
				count++;
			}
		}

		System.out.println(count);
	}
}
