package fap;

public class T_LinearSearchArray {

	public static void main(String[] args) {

		String[] arr = { "Java", "Python", "C++", "java", "Java", "JavaScript" };

		display(arr);
		System.out.println(" ");

		String searchSt = "Java";

		boolean flag = false;

		int i;
		for (i = 0; i < arr.length; i++) {

			if (searchSt.equals(arr[i])) {
				flag = true;
				break;
			}
		}

		if (flag == true)
			System.out.println("Element found at "+i);
		else
			System.out.println("Element do not found");

	}

	static void display(String[] array) {
		System.out.print("The Array is===>[ ");
		for (String a : array) {
			System.out.print(a + " ");
		}
		System.out.print("]");

	}

}