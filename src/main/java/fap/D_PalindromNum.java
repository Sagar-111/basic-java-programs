package fap;

import java.util.Scanner;

public class D_PalindromNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the Number to check: ");
		int num = sc.nextInt();
		
		sc.close();

		int orig_num = num;

		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num=num/10;
		}

		if(orig_num==rev) {System.out.println("Is palindrome number");}
		else System.out.println("Is not palinfrome mumber");
	}

}
