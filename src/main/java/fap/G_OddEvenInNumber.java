package fap;

import java.util.Scanner;

public class G_OddEvenInNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		sc.close();

		int oddCount=0;
		int evenCount=0;

		while(num!=0) {

			if(num%2==0)evenCount++;
			else oddCount++;

			num=num/10;

		}

		System.out.println("Number of ODD digits are:	"+oddCount);
		System.out.println("Number of EVEN digits are:	"+evenCount);

	}

}
