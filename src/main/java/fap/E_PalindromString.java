package fap;

import java.util.Scanner;

public class E_PalindromString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String org_str = sc.nextLine();

		sc.close();
		/*
		 * StringBuilder sb=new StringBuilder(org_str);
		 *
		 * String revString = sb.reverse().toString();
		 */

		String revString = "";

		for (int i = (org_str.length() - 1); i >= 0; i--) {

			revString = revString + org_str.charAt(i);
		}

		if (org_str.equals(revString)) {

			System.out.println("is polindrome string");
		} else {
			System.out.println("is not polindrom string");
		}

	}

}
