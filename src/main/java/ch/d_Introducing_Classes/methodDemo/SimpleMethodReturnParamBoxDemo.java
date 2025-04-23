package ch.d_Introducing_Classes.methodDemo;

public class SimpleMethodReturnParamBoxDemo {

	public static void main(String[] args) {

		SimpleMethodReturnParamBox myBox = new SimpleMethodReturnParamBox();


		myBox.setDim(10, 11, 12);
		double vol = myBox.volume();
		System.out.println("Volume=	"+vol);
	}

}
