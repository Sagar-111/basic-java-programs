package prcts;

import java.util.Arrays;

public class AutodeskIQ2 {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 4, 5 };
		
		/*
		 * int highest = Integer.MIN_VALUE;
		 * 
		 * int secondHighest = Integer.MIN_VALUE;
		 * 
		 * for(int i : arr) { if(i) }
		 */
		
		Arrays.sort(arr);
		
		int heighestNum = arr[arr.length-1];
		
		int secondHighest = 0;
		
		for(int i = arr.length-1; i>=0; i--) {
			if(arr[i] < heighestNum) {
				secondHighest = arr[i];
				break;
			}
		}
		System.out.println(secondHighest);

	}
}
