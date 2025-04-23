package ch.a_Data_Types_Var_Arr;

public class TwoDArray {

    public static void main(String[] args) {

        int arr[][] = new int[4][5]; // Initializing a two-dimensional array

        // Initializing values in the two-dimensional array
        arr[0][0] = 5; arr[0][1] = 7; arr[0][2] = 2; arr[0][3] = 9; arr[0][4] = 8;
        arr[1][0] = 4; arr[1][1] = 3; arr[1][2] = 5; arr[1][3] = 7; arr[1][4] = 11;
        arr[2][0] = 9; arr[2][1] = 4; arr[2][2] = 2; arr[2][3] = 5; arr[2][4] = 7;
        arr[3][0] = 16; arr[3][1] = 12; arr[3][2] = 14; arr[3][3] = 19; arr[3][4] = 18;

        // Iterating through each row (array of integers) using a "for-each" loop
        for (int[] ele : arr) {
            // 'ele' represents each row (an array of integers) in 'arr'
            // Example: 'ele' represents [5, 7, 2, 9, 8] in the first iteration

            // Iterating through each element within the row using another "for-each" loop
            for (int x : ele) {
                // 'x' represents each element within the row 'ele'
                // Example: 'x' represents 5, then 7, then 2, and so on in the first iteration

                // Printing each element of the array 'arr'
                System.out.print(x);
                System.out.print("    ");
            }
            System.out.println(); // Moving to the next line after printing each row
        }
    }
}

