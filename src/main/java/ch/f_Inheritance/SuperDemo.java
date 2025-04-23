package ch.f_Inheritance;

//Here, we are using super for calling super class constructor.
//The this keyword refers to the current object instance, whereas the super keyword refers to the superclass of the current class.
class BoxWeight1 extends Box {

	double weight;

//	Construct clone of an object.
	BoxWeight1(BoxWeight1 ob) {
		super(ob);
		weight = ob.weight;
	}

//	Construct when all parameter are specified.
	BoxWeight1(double height, double width, double depth, double weight) {
		super(height, width, depth);
		this.weight = weight;
	}

//	Construct when all cube is created.
	BoxWeight1(double length, double weight) {
		super(length);
		this.weight = weight;
	}

//	Construct when all cube is created.
	BoxWeight1() {
		super();
		weight = -1;
	}

}

public class SuperDemo {

	public static void main(String[] args) {

		BoxWeight1 myBox = new BoxWeight1(10, 20, 30, 40);
		BoxWeight1 myCube = new BoxWeight1(50, 60);
		BoxWeight1 myDefault = new BoxWeight1();
		BoxWeight1 myClone = new BoxWeight1(myCube);
		double vol;

		vol=myBox.vol();
		System.out.println("Volume of a cuboid box:		"+vol);
		System.out.println("Weight of a cuboid box:		"+ myBox.weight);
		System.out.println("=======================================================");

		vol=myCube.vol();
		System.out.println("Volume of a cube box:		"+vol);
		System.out.println("Weight of a cube box:		"+ myCube.weight);
		System.out.println("=======================================================");

		vol=myDefault.vol();
		System.out.println("Volume of a default box:		"+vol);
		System.out.println("Weight of a default box:		"+ myDefault.weight);
		System.out.println("=======================================================");

		vol=myClone.vol();
		System.out.println("Volume of a obj box:		"+vol);
		System.out.println("Weght of a obj box:		"+ myClone.weight);
		System.out.println("=======================================================");

	}
}
