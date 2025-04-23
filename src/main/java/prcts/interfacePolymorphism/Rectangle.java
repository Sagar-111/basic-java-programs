package prcts.interfacePolymorphism;

public class Rectangle implements Drawable{

	public void draw() {
		System.out.println("Drawing a Rectangle");		
	}
	
	public void reDraw() {
		System.out.println("This method cannot be invoked by using Interface reference.");
		
		
	}
}
