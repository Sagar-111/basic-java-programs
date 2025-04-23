
package fap;

public class C_ReversingAString {

	public static void main(String[] args) {

		usingConcatinationOp();
		usingCharArray();
		usingStringBuffer();

	}

	private static void usingStringBuffer() {

		String str = "ABCD";

		StringBuffer sb=new StringBuffer(str);

		StringBuffer reverse = sb.reverse();

		System.out.println("3. After Reversing :	" + reverse);
	}

	private static void usingCharArray() {

		String str = "ABCD";
		String ch = null; // Instead of null use empty string "".

		char[] chA = str.toCharArray();

		int loA = chA.length;

		for (int i = loA - 1; i >= 0; i--) {

			ch = ch + chA[i];

		}

		System.out.println("2. After Reversing :	" + ch);
	}

	private static void usingConcatinationOp() {

		String str = "ABCD";
		String ch = ""; // Instead of "" use empty string null but it will show you that null char.

		int los = str.length();

		for (int i = los - 1; i >= 0; i--) {// The way you can iterate reverse.

			char charAt = str.charAt(i);

			ch = ch + charAt;

		}
		System.out.println("1. After Reversing :	" + ch);
	}

}
