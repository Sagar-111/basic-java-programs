package ch.d_Introducing_Classes;

public class BoxConstructor {

	double height;
	double width;
	double depth;

	BoxConstructor(){
		System.out.println("Constructing a Box..........");
		height=10;
		width=10;
		depth=10;
	}

	public double volume() {
		double vol=(height*width*depth);
		return vol;
	}
}
