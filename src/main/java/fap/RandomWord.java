package fap;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RandomWord {
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("C:/Users/sgrch/OneDrive/Desktop/algo_1/hello/animals.txt");
		
		Scanner scanner = new Scanner(f);

		String champion = ""; // Initialize the champion word
		int count = 0; // Initialize the word count

		// Loop through each word in the input
		while (scanner.hasNext()) {
			String word = scanner.next();

			count++;

			// Select the current word as the champion with probability 1/count
			if (Math.random() < 1.0 / count) {
				champion = word;
			}
		}

		// Print the surviving champion word
		System.out.println("The random champion word is: " + champion);

		scanner.close();
	}
}
