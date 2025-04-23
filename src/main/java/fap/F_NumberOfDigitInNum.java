package fap;

import java.util.Scanner;

public class F_NumberOfDigitInNum {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		sc.close();

		int numCount=0;

		while(num!=0) {

			num=num/10;
			numCount++;

		}

		System.out.println("Number of digit in the number are "+numCount);
	}

}
