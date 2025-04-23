package fap;

public class Z_OccurenceOfCharacter {

	public static void main(String[] args) {

		String s = "Java Developer java OOps";

		int length = s.length();

		int length2 = s.replace("a", "").length();

		int count = length - length2;
		System.out.println("The occurence of letter is:	" + count);
	}

}
