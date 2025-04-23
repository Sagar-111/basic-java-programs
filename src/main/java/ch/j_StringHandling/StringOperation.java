package ch.j_StringHandling;

import java.util.Arrays;

public class StringOperation {

	public static void main(String[] args) {
		
//		Concatenation.
		String str1 = "Sa gar";
		String str2 = " Choudhari knows java programming a little bit";
		
		System.out.println(str1 + str2);
		
//		Conversion and toString() 
		StringDemo sd = new StringDemo();
		
		System.out.println(sd);
		
//		Character extraction
		char charAt = str1.charAt(3);
		
		System.out.println(charAt);
		
		char[] chars = str1.toCharArray();
		
		String charStr = Arrays.toString(chars);	//method for printing the array.
		
		System.out.println("Array formed:  "+charStr);
		
			
//		Using getChars(int start, int end, String target, int targetStart);
		
		char[] subStr = new char[7];
		
		str2.getChars(17, 21, subStr, 2);
		
		System.out.println(subStr);
	}
}
