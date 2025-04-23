package fap;

public class Q_MissingNumberFromArray {

	public static void main(String[] args) {

		int[] elements = { 11, 12, 14, 15 };

		int sum1 = 0;

//		APPROACH__1
//		Iterate using for loop.
		for (int i = 0; i < elements.length; i++) {

			sum1 = sum1 + elements[i];
		}
		System.out.println("The Sum With Missing=	" + sum1);

		int sum2 = 0;

		for (int i = 11; i <= 15; i++) {

			sum2 = sum2 + i;
		}

		System.out.println("The Sum Without Missing=	" + sum2);
		
		System.out.println("The missing Number is:	"+(sum2-sum1));
	}

}
