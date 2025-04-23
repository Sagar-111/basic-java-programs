package prcts;

import java.util.Arrays;

public class TripletsFromArray {

	public static void main(String[] args) {
		int[] arr = { 10, 13, 14, 15, 16, 19, 20, 22, 23, 24 };

		Arrays.sort(arr);

		for (int i = 0; i < arr.length-2; i++) {
			
			if(arr[i]+1==arr[i+1] && arr[i+1]+1==arr[i+2]) {
				
				System.out.println(arr[i]+", "+arr[i+1]+", "+arr[i+2]);
			}

		}

	}
}
