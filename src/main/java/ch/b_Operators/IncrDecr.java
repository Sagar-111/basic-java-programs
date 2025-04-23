package ch.b_Operators;

public class IncrDecr {

	public static void main(String[] args) {

		int a = 5;
		int b = a++;  // b gets the value of a (5), then a is incremented
//		Equivalent to:
//		b = a;
//		a = a + 1;
		System.out.println("a = " + a + ", b = " + b);  // Output: a = 6, b = 5



		int x = 5;
		int y = ++x;  // a is incremented first, then y gets the incremented value of x
//		Equivalent to
//		x = x + 1;
//		y = x;
		System.out.println("x = " + x + ", y = " + y);  // Output: x = 6, y = 6

		
	}

}
