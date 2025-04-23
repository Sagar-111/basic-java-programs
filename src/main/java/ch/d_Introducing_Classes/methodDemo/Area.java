package ch.d_Introducing_Classes.methodDemo;

public class Area {

	public static void main(String[] args) {
		Circle cir = new Circle(7);
		double calculateArea;

		calculateArea = cir.calculateArea();

		System.out.println("Area of circle= "+calculateArea);

		cir.display();

		Rectangle rect = new Rectangle(11, 11);

		calculateArea = rect.calculateArea();

		System.out.println("Area of circle= "+calculateArea);

		rect.display();

	}

}
