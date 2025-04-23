package ch.f_Inheritance;
//This way of extending super class is tedious task so we can use SuperDemo type inheritance in which super is used to call super class constructor instead of hard coding every variable.
class BoxWeight extends Box {
	double weight;

	BoxWeight(double height, double width, double depth, double weight) {
		this.height = height;
		this.width = width;
		this.depth = depth;
		this.weight = weight;
	}

}

public class BoxWeightDemo {

	public static void main(String[] args) {
		BoxWeight myBox = new BoxWeight(10, 20, 30, 40);
		double vol = myBox.vol();

		System.out.println("Volume of a box:	" + vol);
		System.out.println("Weight of a box:	" + myBox.weight);

//		Super class variable can reference a subclass object.

		BoxWeight subObj = new BoxWeight(11, 22, 33, 45);
		Box superVar = new Box();

		System.out.println("--------------------Referencing super class var not obj to subclass object-----------------------");
		superVar=subObj;
		double vol1 = superVar.vol();
		System.out.println("Volume of a box:	" + vol1);

//		System.out.println("Weight of a box:	" + superVar.weight);//Shows error as Super class obj defines volume but not weight.


	}
}
