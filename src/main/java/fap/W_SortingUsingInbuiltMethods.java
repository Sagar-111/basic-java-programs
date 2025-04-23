package fap;

import java.util.Arrays;
import java.util.Collections;

public class W_SortingUsingInbuiltMethods {

	public static void main(String[] args) {

		int[] arr = { 11, 14, 8, 5, 9, 20 };

		display(arr);
		System.out.println(" ");

		Arrays.sort(arr);

		System.out.println("After sorting");

		display(arr);
		
//		To put it in reverse order using in built method.
		Integer[] arr1={50,80,30,10,20,70,90};
		
		Arrays.sort(arr1, Collections.reverseOrder());
		
		System.out.println("arr1 After reversing "+Arrays.toString(arr1));
		

	}

	static void display(int[] array) {
		System.out.print("The Array is===>[ ");
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.print("]");

		System.out.println(" ");

	}

}