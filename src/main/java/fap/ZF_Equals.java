package fap;

public class ZF_Equals {

	public static void main(String[] args) {
		// Scenario 1: Comparing string literals with ==
		String str1 = "hello";
		String str2 = "hello";
		System.out.println("Comparing string literals with ==:");
		System.out.println("str1 == str2: " + (str1 == str2)); // true
		System.out.println("str1.equals(str2): " + str1.equals(str2)); // true

		// Scenario 2: Comparing string objects created with 'new' keyword with ==
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println("\nComparing string objects created with 'new' keyword with ==:");
		System.out.println("str3 == str4: " + (str3 == str4)); // false
		System.out.println("str3.equals(str4): " + str3.equals(str4)); // true

		// Scenario 3: Comparing string literals and objects with ==
		System.out.println("\nComparing string literals and objects with ==:");
		System.out.println("str1 == str3: " + (str1 == str3)); // false
		System.out.println("str1.equals(str3): " + str1.equals(str3)); // true

		// Scenario 4: Comparing string objects with different content
		String str5 = "hello";
		String str6 = "world";
		System.out.println("\nComparing string objects with different content:");
		System.out.println("str5 == str6: " + (str5 == str6)); // false
		System.out.println("str5.equals(str6): " + str5.equals(str6)); // false

		// Scenario 5: Concatenation of string literals and comparison
		String str7 = "hello";
		String str8 = "he" + "llo";
		System.out.println("\nConcatenation of string literals and comparison:");
		System.out.println("str7 == str8: " + (str7 == str8)); // true
		System.out.println("str7.equals(str8): " + str7.equals(str8)); // true

		// Scenario 6: Concatenation of strings using 'new' keyword and comparison
		String str9 = new String("hello");
		String str10 = "hello";
		System.out.println("\nConcatenation of strings using 'new' keyword and comparison:");
		System.out.println("str9 == str10: " + (str9 == str10)); // false
		System.out.println("str9.equals(str10): " + str9.equals(str10)); // true
	}

}
