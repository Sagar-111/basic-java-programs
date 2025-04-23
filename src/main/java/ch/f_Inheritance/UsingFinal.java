package ch.f_Inheritance;

final class SuperClass {
	SuperClass() {
		System.out.println("This SuperClass cannot be inherited as it is declared as \"final\" ");
	}
}

class Subclass {// extends SuperClass-- if try to do so there will occur an error.

	final public static void show() {
		System.out.println("Final method fron Subclass");
	}
}

class SubclassB extends Subclass {// extends SuperClass-- if try to do so there will occur an error.

	/*
	 * public static void show() {
	 * System.out.println("You cannot override the method from the superclass declared as final."); }
	 */
}

public class UsingFinal {

//	Use of final to prevent overloading and inheritance.
	public static void main(String[] args) {

		Subclass.show();
	}
}
