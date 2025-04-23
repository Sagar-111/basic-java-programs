package fap;

import java.util.Scanner;

public class J_FibnocciSEries {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.print("Entered initial value=");
		int initialValue = sc.nextInt();	
		
		System.out.print("First increment value=");

		int	incr=sc.nextInt();
		
		sc.close();
		
		System.out.println("First 10 digit of Fibnocci series.......");
		int lenthOfSeries=0;
		for(lenthOfSeries=0; lenthOfSeries<=11; lenthOfSeries++ ) {
			int num=incr+initialValue;
			System.out.print(num+" ");
			incr=initialValue;
			initialValue=num;
		}
		
		
		
	}

}
