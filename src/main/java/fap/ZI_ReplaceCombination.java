package fap;

import java.util.Iterator;
import java.util.Set;

public class ZI_ReplaceCombination {

	public static void main(String[] args) {

		Set<String> allCombinations = ZH_WordCombinations.getAllCombination("abeiout");

		String str = "Testing is a boring job"; // op:-Tesng is a ring j.

		Iterator<String> iterator = allCombinations.iterator();

		String string = null;

		while (iterator.hasNext()) {

			String pair = iterator.next();

			if (str.contains(pair)) {
				
				string = str.replace(pair, "");

				str = string;
			}
		}

		System.out.println(string);

	}
}
