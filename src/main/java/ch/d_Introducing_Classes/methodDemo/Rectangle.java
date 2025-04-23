package ch.d_Introducing_Classes.methodDemo;

public class Rectangle extends Shape{
	private double length;
	private double width;

	Rectangle(double length, double width){
		this.length = length;
		this.width = width;
	}

	@Override
	double calculateArea() {
		return length*width;

	}
}
