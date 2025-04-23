package ch.e_A_Closer_Look_At_Method_And_Classes;

public class RecursionCompilation {

	public static void main(String[] args) {
//		1. Fiboacci series.
		fibonacci(3, 2, 10);// took very little help of chat.
		
//		sumOfDigits();
		
//		3. Power of a number.
		int powerOfNumber = powerOfNumber(3, 5);

		System.out.println("Power of a given number is : " + powerOfNumber);
		
//		4. GCD - Greatest common divisor of a number.
		int gcd = findGCD(10, 20);
		System.out.println(gcd);

	}

	private static int findGCD(int num1, int num2) {
		if(num2==0) {return num1;}
		else {
            return findGCD(num2, num1 % num2);
        }
	}

	private static int powerOfNumber(int number, int degree) {

		int power = number;

		if (degree == 1)
			return power;

		power = power * powerOfNumber(power, degree - 1);

		return power;
	}

	public static int fibonacci(int firstTerm, int firstIncr, int countOfTerm) {

		if (countOfTerm <= 0) {
			return firstTerm;
		}

		System.out.print(firstTerm + " ");

		return fibonacci(firstTerm + firstIncr, firstTerm, countOfTerm - 1);
	}

}
