package ch.f_Inheritance;

//Overridden method support run-time Polymorphism.
//Combining Inheritance with Overridden methods, a superclass can define the general form of the methods that will be used by all of it's subclass.
class Figure{
	double dim1;
	double dim2;

	Figure(double a, double b) {
		dim1=a;
		dim2=b;
	}

	double area() {
		System.out.println("Undefined figure");
		return 0;
	}
}

class Rectangle extends Figure{

	Rectangle(double a, double b){
		super(a, b);
	}

	@Override
	double area() {
		System.out.println("The given figure is Rectangle and its Area is: ");
		return dim1*dim2;

	}
}

class Triangle extends Figure{

	Triangle(double a, double b) {
		super(a, b);
	}


	@Override
	double area() {
		System.out.println("The given figure is Triangle and its area is:	");
		return dim1*dim2/2;

	}

}

public class DynamicMethodDispatch {
/*Dynamic Method Dispatch is the mechanism by which call to the overridden method is resolved at run-time not at compile time.
 As a super class reference can refer to the subclass object, depending on the type of object being referred to, the right method is chosen at run time.
 -If a superclass contains methods that are overridden by the subclass, Then when different types of objects are referred to through a superclass reference variable, different version of the method are executed.

 */
	public static void main(String[] args) {

		Figure fig = new Figure(10,20);
		Rectangle rect= new Rectangle(12, 15);
		Triangle tri = new Triangle(12,14);

		Figure figRef;

		figRef=fig;
		System.out.println(figRef.area());

		figRef=rect;
		System.out.println(figRef.area());

		figRef=tri;
		System.out.println(figRef.area());

	}
}
