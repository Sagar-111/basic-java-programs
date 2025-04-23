package ch.e_A_Closer_Look_At_Method_And_Classes;

public class StringDemo {

	public static void main(String[] args) {
//String is a class and what ever string we are creating we are creating an object of String class.
		String strOBj1 = "First String";
		String strOBj2 = "Second String";
		String strOBj3 = strOBj1 + " and " + strOBj2;

		System.out.println(strOBj1);
		System.out.println(strOBj2);
		System.out.println(strOBj3);

//		Some methods provided by the string class.
		boolean bl = strOBj1.equals(strOBj2);
		System.out.println("Are strings equal:	"+bl);

		int length = strOBj2.length();
		System.out.println("Length of the String 2:	"+length);

		char charAt = strOBj3.charAt(6);
		System.out.println("The char at index 6:	"+charAt);
	}

}
