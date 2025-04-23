package prcts.methodOverriding;

public class Area {

	public static void main(String[] args) {
		
		Shape sh = new Shape();

		Rectangle rect1 = new Rectangle(5, 10);

		Circle cir1 = new Circle(5);
		
		System.out.println("Area of shape:	"+sh.calculateArea());

		System.out.println("Area of Rectangle:	" + rect1.calculateArea());
		System.out.println("Area of Circle:	" + cir1.calculateArea());

	}

}
