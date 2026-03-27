package org.chatInitiative.day1;

import java.util.Arrays;
import java.util.Scanner;

// Check boundary conditions to be more sure about the unnecessary execution or wrong output.
//Make sure you dry run with boundary condition and one or two tru condition in loop.

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 4, 1, 3, 5, 7, 5, 0};
        Scanner sc = new Scanner(System.in);
        System.out.print("Please provide rotation frequency......");
        int rotationFreq = sc.nextInt();
        int[] result = rotateArray(arr, rotationFreq);
        System.out.print(Arrays.toString(result));
    }

    private static int[] rotateArray(int[] arr, int rotationFreq) {
        if (arr == null || arr.length <= 1) return arr;
        int effectiveRotation = rotationFreq % arr.length;
        if (effectiveRotation == 0 || rotationFreq == 0) return arr;
        else {
            rotationFreq = effectiveRotation;
            reverseArrayWithinRange(arr, 0, arr.length - 1);
            reverseArrayWithinRange(arr, 0, rotationFreq - 1);
            reverseArrayWithinRange(arr, rotationFreq, arr.length - 1);
        }
        return arr;
    }


    private static void reverseArrayWithinRange(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
}

// Time Complexity: O(n) and Space Complexity: O(n)(Since creating temp n/2?)
