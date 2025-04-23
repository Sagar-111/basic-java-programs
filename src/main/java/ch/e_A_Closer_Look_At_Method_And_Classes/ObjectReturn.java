package ch.e_A_Closer_Look_At_Method_And_Classes;

public class ObjectReturn {

	public static void main(String[] args) {

//		value to a is assigned here.
		ObjectRet object = new ObjectRet(20);
		int a = object.a;
		System.out.println("Initial value of a:		" + a);

//		Calling the method incrementByTen() have return an object of a class.
		ObjectRet objectReturned = object.incrementByTen();

//		For getting the value of 'a' passed to this object.
		System.out.println("After incrementing the value of a:		" + objectReturned.a);

	}

}
