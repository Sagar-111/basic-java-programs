package ch.d_Introducing_Classes.methodDemo;

public class SimpleMethodReturnBoxDemo {

	public static void main(String[] args) {

		SimpleMethodReturnBox myBox = new SimpleMethodReturnBox();

		// To assign values to the variables.
		myBox.d = 10;
		myBox.h = 11;
		myBox.w = 12;

		double volume = myBox.volume();
		System.out.println("Volume=	"+volume);
	}

}
