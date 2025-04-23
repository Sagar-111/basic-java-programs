package fap;

import java.util.Arrays;

public class P_EqualityOfArrays {

	public static void main(String[] args) {

		int[] ints1 = new int[15];

		for (int i = 0; i < 15; i++) {

			ints1[i] = i + 1;
		}

		int[] ints2 = new int[15];

		for (int i = 0; i < 15; i++) {

			ints2[i] = i + 1;
		}

		display(ints1);
		System.out.println(" ");
		display(ints2);
		System.out.println("");

//		APPROACH__1

		boolean value = ints1.equals(ints2);//Since both the object reference to two different object hence gives false.

		System.out.println("Mehtod from object class shows:	" + value);
		
		boolean status = Arrays.equals(ints1, ints2);
		System.out.println("APPROACH:1	Arrays are Equal:	" + status);
		

//		APPROACH__2		

		if (ints1.length == ints2.length) {

			for (int i = 0; i < ints1.length; i++) {

				if (ints1[i] != ints2[i]) {

					System.out.println("The arrays are not Equal");
				} else
					break;
			}

			System.out.println("APPROACH:2	Arrays are Equal:	true");
		}

		else
			System.out.println("Arrays are not equal");
	}

	static void display(int[] array) {
		System.out.print("The Array is===>[ ");
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.print("]");
	}

}
