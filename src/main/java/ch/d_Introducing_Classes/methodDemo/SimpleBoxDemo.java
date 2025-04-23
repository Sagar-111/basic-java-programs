package ch.d_Introducing_Classes.methodDemo;

public class SimpleBoxDemo {

	public static void main(String[] args) {

		SimpleBox myBox = new SimpleBox();

		// To assign values to the variables.
		myBox.d = 10;
		myBox.h = 11;
		myBox.w = 12;

		System.out.println("Volume:	" + (myBox.d * myBox.h * myBox.w));
	}

}
