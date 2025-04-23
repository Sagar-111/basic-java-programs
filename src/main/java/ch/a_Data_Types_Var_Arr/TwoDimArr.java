package ch.a_Data_Types_Var_Arr;

public class TwoDimArr {

	public static void main(String[] args) {

//		multidimensional arrays are array of array.
		int[][] twod = new int[3][4]; // 3 row and 4 column.
		int i, j, k = 0;

//		Adding value in the 3 * 4 loop. Using for loop.
		for (i = 0; i < 3; i++) {

			for (j = 0; j < 4; j++) {

				System.out.print(twod[i][j] = k);
				System.out.print("   ");
				k++;
			}
			System.out.println("  ");
		}


//		Adding value in the 3 * 4 loop. Using for-each loop.
		int m=0;
//		Using for each loop.
		for (int[] ele : twod) {

			for (@SuppressWarnings("unused") int ks : ele) {
				System.out.print(ks=m);
				System.out.print("  ");
				m++;
			}
				System.out.println("  ");
		}

	}

}
