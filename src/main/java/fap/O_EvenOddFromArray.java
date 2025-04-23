package fap;

public class O_EvenOddFromArray {

	public static void main(String[] args) {

		int[] ints = new int[15];

		for (int i = 0; i < 15; i++) {

			ints[i] = i + 1;
		}

		display(ints);
		System.out.println(" ");
//		APPROACH__1
		System.out.println("The even Numbers:	");
		for (int num : ints) {

			if (num % 2 == 0) {
				System.out.print(num + " ");
			}
		}

		System.out.println(" ");
		
		System.out.println("The odd Numbers:	");
		for (int num : ints) {

			if (num % 2 != 0) {
				System.out.print(num + " ");
			}
		}
	}

	static void display(int[] array) {
		System.out.print("The Array is===>[ ");
		for (int a : array) {
			System.out.print(a + " ");
		}
		System.out.print("]");
	}

}
