package fap;


public class M_FActorialOfNumber {

	public static void main(String[] args) {

		method1(5);
		int fact = recursion(6);//Factorial using Recursion of method.
		System.out.println("factorial=	"+fact);
		
	}

	private static int recursion(int num) {
		int result;

		if (num == 1)
			return 1;

		result = recursion(num - 1) * num;

		return result;

	}

	private static void method1(int num) {

		long factorial = 1;

		for (int i = 1; i <= num; i++) {
			factorial = factorial * i;
		}

//		Approach 2

/*		for (int i = num; i >= 1; i--) {
			factorial = factorial * i;
		}*/

		System.out.println("Factorial of a number:	" + factorial);

	}

}
