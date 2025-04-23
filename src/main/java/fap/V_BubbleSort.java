package fap;

public class V_BubbleSort {

	public static void main(String[] args) {

		int[] arr = { 11, 14, 8, 5, 9, 20 };

		display(arr);
		System.out.println(" ");

		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println("After bubble sorting ");
		display(arr);

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