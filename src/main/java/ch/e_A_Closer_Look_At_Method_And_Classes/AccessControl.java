package ch.e_A_Closer_Look_At_Method_And_Classes;

class Access {
	int a;
	public int b;
	private int c;

//	Method to set value of c which is private member of a class.
	void setC(int i) {
		c = i;
	}

//	Method to get value of c.
	int getC() {
		return c;
	}

}

public class AccessControl {

	public static void main(String[] args) {

		Access obj = new Access();
		obj.a = 10;
		obj.b = 20;
//		obj.c; will show an error, can't access the private member directly.

		obj.setC(15);
		int c = obj.getC();
		System.out.println("Values of a,  b,	c:	"+obj.a+" "+obj.b+"  "+c);
	}

}
