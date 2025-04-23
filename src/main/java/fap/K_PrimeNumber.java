package fap;

import java.util.Scanner;

public class K_PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check for prime=");
		int num = sc.nextInt();

		if (num < 2)
			System.out.println("Not prime");

//		Approach 1
//		int countOfDevisor = 0;
//
//		for (int i = 1; i <= num; i++) {
//
//			if (num % i == 0)
//				countOfDevisor++;
//		}
//
//		if (countOfDevisor == 2)
//			System.out.println("Is Prime Number");
//		else
//			System.out.println("Is NOT Prime Number");

//		Approach 2 from McGrawHill

		System.out.println("Enter the number to check for prime=");
		int num1 = sc.nextInt();

		sc.close();

		boolean isPrime;

		if (num < 2)
			isPrime = false;
		else
			isPrime = true;

		for (int i = 2; i <= num1/i; i++) {

			if ((num1 % i) == 0) {
				isPrime = false;
			break;}
		}
		System.out.println("The number is Prime : " + isPrime);

	}

}
