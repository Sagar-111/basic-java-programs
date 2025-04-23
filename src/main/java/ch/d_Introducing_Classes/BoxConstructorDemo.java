package ch.d_Introducing_Classes;

public class BoxConstructorDemo {

	public static void main(String[] args) {

		BoxConstructor myBox = new BoxConstructor();
		double vol = myBox.volume();
		System.out.println("Volume=	" + vol);

		BoxConstructor myBox1 = new BoxConstructor();
		double vol1 = myBox1.volume();
		System.out.println("Volume=	" + vol1);
	}

}
