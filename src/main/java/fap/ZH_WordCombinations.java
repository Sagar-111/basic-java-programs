package fap;

import java.util.HashSet;
import java.util.Set;

public class ZH_WordCombinations {

	public static Set<String> getAllCombination(String input) {

		String str = input;

		HashSet<String> hs = new HashSet<>();

		for (int j = 0; j < str.length(); j++) {

			char charAt1 = str.charAt(j);
			for (int i = 0; i < str.length(); i++) {
				char charAt2 = str.charAt(i);
				String comb = String.valueOf(charAt1) + String.valueOf(charAt2);
				hs.add(comb);
			}

		}
		return hs;
	}
}
