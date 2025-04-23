package ch.e_A_Closer_Look_At_Method_And_Classes;

class Factorial {

	int factorial;

	int fact(int n) {
		if (n == 1)
			return 1;
//		Calling method by itself is called recursion.
		factorial = n * fact(n - 1);
		return factorial;
	}
}

public class Resursion {

	public static void main(String[] args) {

		Factorial obj = new Factorial();

		int factorialOfNumber = obj.fact(5);
		System.out.println("Factorial of a number provided is :	" + factorialOfNumber);

	}

}
