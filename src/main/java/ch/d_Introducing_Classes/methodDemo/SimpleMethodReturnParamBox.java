package ch.d_Introducing_Classes.methodDemo;

public class SimpleMethodReturnParamBox {

	double height;
	double width;
	double depth;
//	This class has no physical existence unless an object of this class is created.
	public void setDim(double h, double w, double d) {
		height=h;
		width=w;
		depth=d;
	}

	public double volume() {
		double vol=(height*width*depth);
		return vol;
	}
}
