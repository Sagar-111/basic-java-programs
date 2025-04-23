package prcts;

public class SmallestFromRowBiggestFromColumn {

	public static void main(String[] args) {
        int[][] arr = {
            { 0, 2, 3 },
            { 1, 2, 5 },
            { 7, 9, 3 }
        };

        // Finding the smallest element in each row
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                }
            }
            System.out.println("Smallest element in row " + (i + 1) + ": " + min);
        }

        // Finding the largest element in each column
        for (int j = 0; j < arr[0].length; j++) {
            int max = arr[0][j];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            System.out.println("Largest element in column " + (j + 1) + ": " + max);
        }
    }
}
