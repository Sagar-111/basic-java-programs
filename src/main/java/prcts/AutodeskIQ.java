package prcts;

public class AutodeskIQ {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4 , 4, 5, 5};

		int highest = Integer.MIN_VALUE;

		int secondHighest = Integer.MIN_VALUE;

		for (int number : arr) {
			if (number > highest) {
				highest = number;
				System.out.println(highest);
			}
		}

		for (int number : arr) {
			if (number < highest && number > secondHighest) {
				secondHighest = number;
			}
		}

		System.out.println(secondHighest);

	}
}
