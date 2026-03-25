package prcts;

import java.util.Arrays;

public class AllSubarrays {

    // Method to generate all subarrays
    public int[][] generatAllArr(int[] A) {
        int n = A.length;
        int totalSubarrays = n * (n + 1) / 2;
        int[][] result = new int[totalSubarrays][];

        int currentRow = 0;

        for (int i = 0; i < n; i++) {           // Start index
            for (int j = i; j < n; j++) {       // End index

                int subSize = j - i + 1;
                result[currentRow] = new int[subSize];

                for (int k = i; k <= j; k++) {  // Fill elements
                    result[currentRow][k - i] = A[k];
                }
                currentRow++;
            }
        }
        return result;
    }

    // Method to print the 2D array in a readable format
    public void printSubarrays(int[][] matrix) {
        System.out.println("Generated Subarrays:");
        for (int i = 0; i < matrix.length; i++) {
            // Using Arrays.toString for a clean [1, 2, 3] style output
            System.out.println("Subarray " + (i + 1) + ": " + Arrays.toString(matrix[i]));
        }
    }

    public static void main(String[] args) {
        AllSubarrays subArr = new AllSubarrays();

        // Test Input
        int[] A = {1, 2, 3, 4, 5};

        // Generate
        int[][] allSubarrays = subArr.generatAllArr(A);

        // Print
        subArr.printSubarrays(allSubarrays);
    }
}
