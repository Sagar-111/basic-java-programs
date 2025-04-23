package ch.d_Introducing_Classes;

public class BoxConstructorParam {

	double height;
	double width;
	double depth;

	BoxConstructorParam(double h, double w, double d){
		System.out.println("Constructing a Box..........");
		height=h;
		width=w;
		depth=d;
	}

	public double volume() {
		double vol=(height*width*depth);
		return vol;
	}
}
