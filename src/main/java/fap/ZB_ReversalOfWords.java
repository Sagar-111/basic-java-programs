package fap;

public class ZB_ReversalOfWords {

	public static void main(String[] args) {

		String s = "Java Developer java OOps";

		String[] words = s.split(" ");

		String reversedString = "";

		for (String word : words) {

			String reversedWord = "";

			for (int i = word.length() - 1; i >= 0; i--) {

				reversedWord = reversedWord + word.charAt(i);
			}

			reversedString = reversedString + reversedWord + " ";
		}

		System.out.println(reversedString);
	}

//	For reversing the word you can use the string Builder and buffer class.
}
