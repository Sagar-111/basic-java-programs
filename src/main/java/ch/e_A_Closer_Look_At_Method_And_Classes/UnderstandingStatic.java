package ch.e_A_Closer_Look_At_Method_And_Classes;

class StaticDemo{
	 static int a;
	static void staticMethod() {
		System.out.println("Method is called not by obj, rather by class name only. As, it is static.......");
	}
}

public class UnderstandingStatic {

	static int a=3;
	static int b;
	static final int FINAL_INT_J = 10;//Final field are represented in UPPER case.

	static final void meth(int x) {//final do not modification in that member.
//		FINAL_INT_J=15;You can't change final fields once declared.
		System.out.println("FINAL_INT_J:	"+FINAL_INT_J);
		System.out.println("a:	"+a);
		System.out.println("b:	"+b);
		System.out.println("x:	"+x);
	}

//	This is called as static block, it is used to set global variable as it execute before all other method.
	static {
		System.out.println("The Static block is initialized.....");
		b=(a*4);
	}
	public static void main(String[] args) {

		meth(40);//Can directly call static method of it's block.


		StaticDemo.a=15;
		System.out.println("value of a from demo:	"+StaticDemo.a);
		StaticDemo.staticMethod();//Need class name with dot operator to call static method and instance variable of other class.
	}

}
