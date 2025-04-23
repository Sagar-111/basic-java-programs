package ch.f_Inheritance;

// Using super for accessing super class member to avoid hiding by the other member of the sub-class with the same name.
class A {

	int i = 25;

	void method() {
		System.out.println("Method from super");
	}
}

class B extends A {
	int i = 20;

	@Override
	void method() {
		System.out.println("Mehtod from sub");
	}

	void show() {
		method();//This is to show that one method can call other method directly.
		super.method();	//Accessing super class method although it is overridden.
		System.out.println("This i is from sub class:	" + i);
		System.out.println("This is is from super class:	" + super.i);
		System.out.println("Sum of both i's:	" + (i + super.i));
	}
}

public class UseOfSuper {

	public static void main(String[] args) {

		B subObj = new B();
		subObj.method();//This will call the overridden method from subclass.
		subObj.show();
		// Calling method from superclass using the subclass object
//        subObj.super.method(); // This will cause a compile-time error, hence when there are overriding methods to call method from super class you have to create an instance of super class.

	}

}
