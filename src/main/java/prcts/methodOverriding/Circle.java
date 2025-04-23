package prcts.methodOverriding;

public class Circle extends Shape {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	public double calculateArea() {

		double area = Math.PI * radius * radius;

		return area;

	}
}
