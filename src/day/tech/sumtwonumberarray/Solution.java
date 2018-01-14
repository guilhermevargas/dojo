package day.tech.sumtwonumberarray;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	static int numberOfPairs(int[] a, long k) {
		Set<Integer> differenceValues = new HashSet<Integer>();
		
		int numbersOfPairs = 0;
		
		for (int i : a) {
			if (i > k)
				continue;
			
			int difference = (int) Math.abs(i - k);
			
			if (differenceValues.contains(i)) {
				numbersOfPairs++;
				differenceValues.remove(i);
			} else {
				differenceValues.add(difference);
			}
		}

		return numbersOfPairs;
	}
}
