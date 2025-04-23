package prcts;

import java.util.HashMap;

public class RepeatedAndNonrepeatedChar {

	public static void main(String[] args) {

		String str = "S agar Choudhari";

		HashMap<Character, Integer> hm = new HashMap<>();

		char firstRepeatedChar = '\u0000';

		char firstNonRepeatedChar = '\u0000';

		for (char ch : str.toCharArray()) {

			if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			} else {
				hm.put(ch, 1);
			}
		}
		
		for(char ch : str.toCharArray()) {
			if(hm.get(ch)==1) {
				firstNonRepeatedChar = ch;
				break;
			}
		}
		
		for(char ch : str.toCharArray()) {
			if(hm.get(ch) > 1) {
				firstRepeatedChar = ch;
				break;
			}
		}
		
		
		System.out.println(firstRepeatedChar);
		System.out.println(firstNonRepeatedChar);
	}
}
