package ch.e_A_Closer_Look_At_Method_And_Classes;

public class OverLoading {
	public int z;/*x,y,z- are just used for observing public, private, package protected members.*/
	@SuppressWarnings("unused")
	private int y;
	int x;
	public static void main(String[] args) {
//Call to the method will be dynamic. That is depending on the arguments passed to the invoked method the method will differentiated by the compiler at run time and respective method will be called though they have same name.

//		If the arguments do not match with the compiler use the 'Automatic type conversion' to resolve the arguments.

		testLoading();
		testLoading(5);//Even method with integer as a parameter is not created but, 'Automatic type conversion' to resolve the arguments and invoke the right method.
		testLoading(11.5);
		testLoading("Sagar");
		testLoading(11, "Dhruv");
		testLoading(11, 12.25);
	}

	public static void testLoading() {
		System.out.println("Method with no parameter");
	}

//	private static void testLoading(int i) {
//		System.out.println("Method with Integer as parameter");
//	}//To see the Automatic type conversion.

	static void testLoading(double d) {
		System.out.println("Method with Double as parameter");
	}

	public static void testLoading(int a, double d) {
		System.out.println("Method with Integer, Double as parameter");
	}

	private static void testLoading(String s) {
		System.out.println("Method with String parameter");
	}

	static void testLoading(int a, String s) {
		System.out.println("Method with Integer, String as parameter");
	}

}
