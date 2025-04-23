package prcts;

public class SortOutIntegerFromString {

	public static void main(String[] args) {
		String str = "I have 1000 rupees and I will be spending 100 rupees 99";

		char[] arr = str.toCharArray();

		StringBuilder num = new StringBuilder();

		int sum = 0;

		for (char ch : arr) {
			if (Character.isDigit(ch)) {
				num.append(ch);
			} else {
				if (num.length() > 0) {

					sum = sum + Integer.parseInt(num.toString());

					num.setLength(0);
				}
			}
		}
		
		if (num.length() > 0) {

			sum = sum + Integer.parseInt(num.toString());

			num.setLength(0);
		}

		System.out.println("The sum of integers from the string is = "+sum);

	}

}
