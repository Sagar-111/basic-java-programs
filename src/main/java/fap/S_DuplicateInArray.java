package fap;

import java.util.HashSet;

public class S_DuplicateInArray {

	public static void main(String[] args) {

		String[] arr = { "Java", "Python", "C++", "java", "Java", "JavaScript" };

		display(arr);
		System.out.println(" ");

//		APPROACH_1
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
//	NOTE:	See the value of j properly. it is started looking from the next element to the outer loop, and also it will not throw Exception as j<arr.length.			
				if (arr[i] == arr[j]) {
					System.out.println("Found Duplicate Element:	" + arr[i]);
					flag = true;
				}
			}
		}

		if (flag == false)
			System.out.println("No Duplicate Element Found");

//		APPROACH_2: Using Hashset as it do not allow the duplicate entries.

		HashSet<String> hs = new HashSet<String>();

		for (String s : arr) {
			if (hs.add(s) == false)
				System.out.println("Found Duplicate Element:	"+s);
			flag = true;
		}

		if (flag == false)
			System.out.println("No Duplicate Element Found");
	}

	static void display(String[] array) {
		System.out.print("The Array is===>[ ");
		for (String a : array) {
			System.out.print(a + " ");
		}
		System.out.print("]");

	}

}