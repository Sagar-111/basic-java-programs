package ch.a_Data_Types_Var_Arr;

import java.io.PrintStream;

public class Array {

	public static void main(String[] args) {
		int[] days_of_month; // Declaration of array. type[] varName;
		int year = 2015;
		days_of_month = new int[12]; // Initialization using new. var_name=new type[size];

		days_of_month[0] = 30;

		if ((year % 4) == 0) {
			days_of_month[1] = 29;
		} else {
			days_of_month[1] = 28;
		}

		days_of_month[2] = 31;
		days_of_month[3] = 30;
		days_of_month[4] = 31;
		days_of_month[5] = 30;
		days_of_month[6] = 31;
		days_of_month[7] = 31;
		days_of_month[8] = 30;
		days_of_month[9] = 31;
		days_of_month[10] = 30;
		days_of_month[11] = 31;

		int sum = 0;
		int lenthOfArray = days_of_month.length;
		for (int i = 0; i < lenthOfArray; i++) {

			sum = sum + days_of_month[i];

		}

		System.out.println("average is:   " + (sum / 12)
				+ "---Automatic conversion of double to int have occured otherwise the value was 30.333333333333");
		System.out.println("no. of days in february  " + days_of_month[1] + " days");
		System.out.println(days_of_month.length);

		PrintStream out = System.out;
		out.println("ha ha sysout..........");

	}

}
