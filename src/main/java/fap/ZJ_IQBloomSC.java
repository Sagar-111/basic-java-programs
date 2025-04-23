package fap;

import java.util.Scanner;

public class ZJ_IQBloomSC {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Please enter string here................");

			String str = sc.nextLine();

			int length = str.length();

			String vowels = "AEIOUaeiou";

			String replacedString = "";

			for (int i = 0; i < vowels.length(); i++) {
				char charAt = vowels.charAt(i);
				String ch = String.valueOf(charAt);// char---->String.
				if (str.contains(ch)) {
					replacedString = str.replace(ch, "");
					str = replacedString;
				}
			}

			int length2 = replacedString.length();

			System.out.println(replacedString);

			System.out.println(length - length2);
		} finally {
			sc.close();
		}
	}

}