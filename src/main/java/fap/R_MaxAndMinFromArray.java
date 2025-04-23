package fap;

public class R_MaxAndMinFromArray {

	public static void main(String[] args) {

		int[] arr = new int[15];

		for (int i = 0; i < 15; i++) {

			arr[i] = i + 1;
		}

		display(arr);
		System.out.println(" ");

		int max = arr[0];

//		Finding Maximum value number. Make an Assumption.
		for (int i = 0; i < arr.length; i++) {

			if (max < arr[i]) {
				max = arr[i];
			}

		}
		System.out.println("The Biggest Number is:	" + max);

		int min = arr[0];

//		Finding Minimum value number. Make an Assumption.
		for (int i = 0; i < arr.length; i++) {

			if (min > arr[i]) {
				min = arr[i];
			}

		}
		System.out.println("The Smallest Number is:	" + min);

	}

	static void display(int[] array) {
		System.out.print("The Array is===>[ ");
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.print("]");
	}

}
