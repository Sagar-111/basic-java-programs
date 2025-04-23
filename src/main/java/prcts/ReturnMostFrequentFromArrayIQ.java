package prcts;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ReturnMostFrequentFromArrayIQ {

	public static void main(String[] args) {
		int[] arr = { 0, 2, 3, 1, 2, 5, 7, 9, 3, 2, 4, 1, 6, 4, 2, 3, 1, 2, 5, 1, 1 };

		int lengthOfArray = arr.length;

		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int i = 0; i < lengthOfArray; i++) {

			int key = arr[i];

			if (hm.containsKey(key)) {
				hm.put(key, hm.get(key) + 1);
			} else {
				hm.put(key, 1);
			}
		}

		int champ = 0;

		int frequency = 0;

		Set<Entry<Integer, Integer>> entrySet = hm.entrySet();

		for (Entry<Integer, Integer> e : entrySet) {
			int value = e.getValue();		//if i use Integer will also hold good but it may through null pointer exception,
			if (value > frequency) {
				frequency = value;
				champ = e.getKey();
			}

		}

//		for elements have same frequency use ArrayList to put them together.
		
		System.out.println(hm);
		System.out.println(champ);
		System.out.println(frequency);
	}
}
