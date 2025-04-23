package ch.e_A_Closer_Look_At_Method_And_Classes;

final class Outer {

	static int x = 11;

	void method() {

		Inner inn_obj = new Inner();
		inn_obj.display();
	}

	static class Inner {// Inner nested class can be given a static modifier. But not to outer. if inner class specified as static in that case it can access only static member of outer class.
		int y = 15;

		void display() {
			System.out.println(
					"Displaying outer x as inner class has access to outer methods and variables:	" + x + "y:	" + y);
		}
	}
//	void displayY() {
//		System.out.println("Displaying Inner y shows error as outer class has no access to inner methods and variables:	"+x+"y:	"+y);
//				} ERROR:
}

public class InnerClass {

	public static void main(String[] args) {

		Outer out_obj = new Outer();
		out_obj.method();
//		inn_obj-do not have existence here, it is only limited to outer class.
		Outer.x = 15;// x modified and again printed.
//		For a final class, the state of its member variables (fields) can still be modified after object creation, as long as the fields themselves are not explicitly declared as final.
		out_obj.method();
//You can change or invoke the member using class name directly if they are static.
	}

}
