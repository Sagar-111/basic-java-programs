package org.chatInitiative.day1;

public class UniqueElements {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) count++;
            }
            if (count == 0) System.out.print(arr[i] + " ");
        }
    }
}

// Time Complexity: O(n^2) and Space Complexity: O(1)
// Check boundary conditions to be more sure about the unnecessary execution or wrong output.
//Make sure you dry run with boundary condition and one or two tru condition in loop.