package ch.j_StringHandling;

public class StringDemo {

	public static void main(String[] args) {

//		To create an empty string.
		String str1 = new String();

		System.out.println(str1);

//		To create an string out of char array.
		char[] chars = { 'S', 'a', 'g', 'a', 'r' };

		String str2 = new String(chars);

		System.out.println(str2);

//		To create string out of char array with start index(1) and number of characters(3).
		String str3 = new String(chars, 1, 3);

		System.out.println(str3);

//		To create string that contains same characters as another one.
		String str4 = new String(str3);

		System.out.println(str4);

//		To create string from string buffer or builder class object.
		StringBuilder sb = new StringBuilder("Sagar");

		String str5 = new String(sb);

		System.out.println(str5);

//		String literals. java automatically construct a String object.
		String str6 = "Sagar";

		System.out.println(str6);
	}
	
	@Override
	public String toString() {
		return "This is StringDemo class object";
//		Since toString() method is overridden here, printing object will print this message, not the hexadecimal representation.
	}
}
