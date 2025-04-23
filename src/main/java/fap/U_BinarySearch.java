package fap;

import java.util.Arrays;

public class U_BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 11, 14, 8, 5, 9, 20 };

		display(arr);
		System.out.println(" ");

		Arrays.sort(arr);

		System.out.println("After sorting");

		display(arr);

		int searchInt = 5;

		boolean flag = false;

		int i = 0;
		
		int m=(arr.length/2);
		
		System.out.println("The midpoint is at	"+ m);

		if (searchInt <= arr[m]) {
			for (i = 2; i >= 0; i--) {
				if (searchInt == arr[i]) {
					flag = true;
					break;
				}
			}
		}

		if (searchInt > arr[m]) {
			for (i = 2; i < arr.length; i++) {
				if (searchInt == arr[i]) {
					flag = true;
					break;
				}

			}
		}

		if (flag == true)
			System.out.println("Element found at " + i);
		else
			System.out.println("Element do not found");

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