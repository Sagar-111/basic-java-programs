package ch.j_StringHandling;

public class StringComparison {

	public static void main(String[] args) {

//		equals() and equalsIgonoreCase()
//		equals() method if both the comparing string contains same characters then return true.
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "BYE-BYE";
		String s4 = "HELLO";
		String s5 = new String(s1);

		System.out.println(s1 + " equals " + s2 + " ---> " + s1.equals(s2));
		System.out.println(s1 + " equals " + s3 + " ---> " + s1.equals(s3));
		System.out.println(s1 + " equals " + s4 + " ---> " + s1.equals(s4));
		System.out.println(s1 + " equalsIgnoreCase " + s4 + " ---> " + s1.equalsIgnoreCase(s4));

//		startsWith() and endsWith();
		System.out.println(s1.startsWith("He"));
		System.out.println(s1.startsWith("llo"));
		System.out.println(s1.endsWith("He"));
		System.out.println(s1.endsWith("llo"));
		
//		== method
		System.out.println(s1 + " equals " + s5 + " ---> " + s1.equals(s5));
		
		System.out.println(s1 + "(s1) == " + s5 + "(s2) ---> " + (s1 == s5));
	}
}
