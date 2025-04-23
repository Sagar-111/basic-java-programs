package prcts.methodOverriding;

public class Rectangle extends Shape {

	double length;
	double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double calculateArea() {

		double area = length * width;

		return area;

	}
}
