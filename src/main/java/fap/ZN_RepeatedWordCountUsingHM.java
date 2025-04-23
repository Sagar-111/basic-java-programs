package fap;

import java.util.HashMap;

public class ZN_RepeatedWordCountUsingHM {
	public static void main(String[] args) {

		// Input: String str = "This this is is done by Kaushal Kaushal";

		// Ouput: {Kaushal=2, by=1, this=1, This=1, is=2, done=1}

		HashMap<String, Integer> hm = new HashMap<>();

		String str = "This this is is done by Kaushal Kaushal";

		String[] strArr = str.split(" ");

		for (int i = 0; i < strArr.length; i++) {
			if (hm.containsKey(strArr[i])) {
				hm.put(strArr[i], hm.get(strArr[i]) + 1);
			} else {
				hm.put(strArr[i], 1);
			}
		}

		System.out.println(hm);

	}
}
