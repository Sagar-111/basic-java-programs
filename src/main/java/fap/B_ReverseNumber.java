package fap;

public class B_ReverseNumber {

	public static void main(String args[]) {

//		String str = "Sagar";

		int muInt = 12345;

//		StringBuilder sb = new StringBuilder(str);
//
//		StringBuilder reverse = sb.reverse();
//
//		System.out.println(reverse);

		StringBuffer sbf = new StringBuffer(String.valueOf(muInt));

		StringBuffer reverse2 = sbf.reverse();

		System.out.println(reverse2);

		int rev = 0;

		while (muInt != 0) {
			rev = rev * 10 + muInt % 10;
			muInt = muInt / 10;
		}
		System.out.println(rev);
	}
}
