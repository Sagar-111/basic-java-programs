package prcts.interfacePolymorphism;

public class Draw {

	public static void main(String[] args) {

		Drawable dwbl = new Circle();

		Drawable dwb2 = new Rectangle();

		Circle circ = new Circle();
		
		circ.draw();
		
		Rectangle rect = new Rectangle();
		
		rect.draw();
		
		Drawable[] obj = {dwbl, dwb2};
		
		for(Drawable ob:obj) {
			ob.draw();
			
		}

	}

}
