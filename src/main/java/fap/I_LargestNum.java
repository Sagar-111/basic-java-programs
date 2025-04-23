package fap;

import java.util.Arrays;
import java.util.Scanner;

public class I_LargestNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first Number");
		int num1 = sc.nextInt();

		System.out.println("Enter Second Number");
		int num2 = sc.nextInt();

		System.out.println("Enter Third Number");
		int num3 = sc.nextInt();

		sc.close();

		if (num1 > num2 && num1 > num3)
			System.out.println("num1 is gretter than num2 and num3");
		else if (num2 > num1 && num2 > num3)
			System.out.println("num2 is gretter than num1 and num3");
		else
			System.out.println("num3 is gretter than num1 and num2");

		System.out.println("Using Ternary operator approach....................................");

		int largest1 = num1 > num2 ? num1 : num2;

		int largest2 = num3>largest1 ? num3 : largest1;
		
		System.out.println(largest2 + " is a Greatter number");
		
		System.out.println("Using ArrayStream approach...........................................");
		
		int[] arr= {num1, num2, num3};
		
		int largest = Arrays.stream(arr).max().orElse(0);
		
		System.out.println(largest + " is a Greatter number");
	}
}
