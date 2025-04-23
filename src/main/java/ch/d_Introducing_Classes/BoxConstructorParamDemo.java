package ch.d_Introducing_Classes;

public class BoxConstructorParamDemo {

	public static void main(String[] args) {

		BoxConstructorParam myBox = new BoxConstructorParam(10, 11, 12);
		double vol = myBox.volume();
		System.out.println("Volume=	" + vol);

//		For the class BoxConstructorParamThis showing instance variable hiding.
		BoxConstructorParamThis myBox1 = new BoxConstructorParamThis(13, 14, 15);
		double vol1 = myBox1.volume();
		System.out.println("Volume=	" + vol1);
	}

}
