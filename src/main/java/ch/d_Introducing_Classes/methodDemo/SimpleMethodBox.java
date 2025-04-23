package ch.d_Introducing_Classes.methodDemo;

public class SimpleMethodBox {

	double h;
	double w;
	double d;
//	This class has no physical existence unless an object of this class is created.

	public void volume() {
		double vol=(h*w*d);
		System.out.println("Volume=	"+vol);
	}
}
