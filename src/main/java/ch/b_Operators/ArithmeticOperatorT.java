package ch.b_Operators;

public class ArithmeticOperatorT {

	public static void main(String[] args) {

		arithmaticOperation();
		compoundOp();
	}

	private static void arithmaticOperation() {
		System.out.println("Arithmatic operations on integers:  ");

		int a = 1 + 2;
		int b = a * 4;
		int c = b - 2;
		int d = c / 2;
		int e = d % 2;

		System.out.println("1+2  :" + a);
		System.out.println("a*4  :" + b);
		System.out.println("b-2  :" + c);
		System.out.println("c/2  :" + d);
		System.out.println("modulus/remainder d%2  :" + e);
		System.out.println("=========================================================");
	}

	public static void compoundOp() {
		System.out.println("var =var operation; to var op=exspression; Compound assignment operator :   ");

		int a = 2;
		int b = 4;
		int c = 5;

		a = a + 4; // a+=4;
		b = b - 2; // b-=2;
		a /= 2; // a=a/2;
		c *= 2; // c=c*2;
		System.out.println("a=2		b=4		c=5	");
		System.out.println("a=a+4	/	a+=4	:" + a);
		System.out.println("b=b-2	/	b-=2	:" + b);
		System.out.println("a/=2	/	a=a/2	:" + a);
		System.out.println("c*=2	/	c=c*2	:" + c);

	}

}
