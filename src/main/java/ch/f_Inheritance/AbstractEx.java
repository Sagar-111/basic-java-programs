package ch.f_Inheritance;

abstract class Diagram {
	double dim1;
	double dim2;

	Diagram(double a, double b) {
		dim1 = a;
		dim2 = b;
	}

//	Abstract class can't be instantiated as they lack in implementation of methods/it is not fully defined. also, you cannot declare abstract constructors or abstract static methods as it will be meaningless to do so. But you can create references for subclass objects.
//	Any subclass of an abstract class must either implement all of the abstract methods in the superclass or declare itself as an abstract class.
	abstract double area();
//	 When a class include as abstract method then the class must also be declared as abstract.
//	Concrete methods are also allowed in the abstract class.
}

class Rect extends Diagram {

	Rect(double a, double b) {
		super(a, b);
	}

	@Override
	double area() {
		System.out.println("The figure is Rectangle and it's area is;	");
		return dim1 * dim2;

	}

}

class Tring extends Diagram {
	Tring(double a, double b) {
		super(a, b);
	}

	@Override
	double area() {
		System.out.println("The figure is a Triangle and it's area is:	");
		return dim1 * dim2/2;
	}
}

public class AbstractEx {

	public static void main(String[] args) {

//		Diagram name = new Diagram(10,20); Show error-cannot instantiated as it is an abstract class.

		Rect rect = new Rect(10, 20);
		Tring tri= new Tring(12, 10);

		Diagram dig;	//This is just the reference not instantiation.

		dig=rect;
		System.out.println(dig.area());

		dig=tri;
		System.out.println(dig.area());

	}

}
