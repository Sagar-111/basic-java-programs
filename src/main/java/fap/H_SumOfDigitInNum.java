package fap;

import java.util.Scanner;

public class H_SumOfDigitInNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		sc.close();

		int sum=0;
		while(num!=0) {

			sum=sum+num%10;

			num=num/10;

		}

		System.out.println("The sum of digits of a Number:	"+ sum);
	}

}
