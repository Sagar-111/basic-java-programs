package ch.j_StringHandling;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {

		String[] arr = { "apple", "Banana", "Nightingale", "Ostrich", "Lion", "monkey", "cat", "Dog", "elephant",
				"Frog", "Giraffe", "Horse", "iguana", "Jackal", "Kangaroo" };

//		Arrays.sort(arr);
		String string = Arrays.toString(arr);
		System.out.println(string);

		for (int j = 0; j < arr.length; j++) {
			for (int i = j + 1; i < arr.length; i++) {
				if (arr[i].compareTo(arr[j]) < 0) {
					String temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		String string1 = Arrays.toString(arr);
		System.out.println(string1);
	}
}
