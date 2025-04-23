package ch.d_Introducing_Classes.methodDemo;

//Abstract class representing a Shape
abstract class Shape {
	// Abstract method to calculate the area
	abstract double calculateArea();

	// Common method applicable to all shapes
	void display() {
		System.out.println("This is a shape.");
	}
}
