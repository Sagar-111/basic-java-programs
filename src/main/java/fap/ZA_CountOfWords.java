package fap;

import java.util.Scanner;

public class ZA_CountOfWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the line to conunt words in it");

		String str1 = sc.nextLine();

		String str = str1.trim();

		int length = str.length();

		int count = 1;

		for (int i = 0; i < length - 1; i++) {

			if (str.charAt(i) == ' ')
				count++;

		}

		System.out.println("Approach_1: The number of words in the string are: " + count);
		sc.close();

//		Approach_2

		String[] split = str.split(" ");

		int length1 = split.length;

		System.out.println("Approach_2: The number of words in the string are: "+length1);
	}

}
