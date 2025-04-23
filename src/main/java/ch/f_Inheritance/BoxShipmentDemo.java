package ch.f_Inheritance;

class Shipment extends BoxWeightForShip{

	double cost;
//	Constructor for clone.
	Shipment(Shipment ob) {
		super(ob);
		cost=ob.cost;
	}

//	Constructor when all dimension are specified.
	Shipment(double height, double width, double depth, double weight, double cost) {
		super(height, width, depth, weight);
		this.cost=cost;
	}

//	Constructor for cube.
	Shipment(double length, double weight, double cost) {
		super(length, weight);
		this.cost=cost;
	}


//	Default constructor.
	Shipment() {
		super();
		cost=-1;
	}

}


public class BoxShipmentDemo {

	public static void main(String[] args) {

		Shipment myBox = new Shipment(10,20,30,40,50);
		Shipment myCube = new Shipment(60, 70, 80);
		Shipment myClone = new Shipment(myBox);
		Shipment myDefault = new Shipment();

		double vol;
		vol=myBox.vol();
		System.out.println("Volume of a cuboid box:		"+vol);
		System.out.println("Weight of a cuboid box:		"+ myBox.weight);
		System.out.println("Volume Cost of  shipment of a cuboid box:		"+ myBox.cost);
		System.out.println("=======================================================");

		vol=myCube.vol();
		System.out.println("Volume of a cube box:		"+vol);
		System.out.println("Weight of a cube box:		"+ myCube.weight);
		System.out.println("Volume Cost of  shipment of a cube box:		"+ myCube.cost);
		System.out.println("=======================================================");

		vol=myDefault.vol();
		System.out.println("Volume of a default box:		"+vol);
		System.out.println("Weight of a default box:		"+ myDefault.weight);
		System.out.println("Volume Cost of  shipment of a default box:		"+ myDefault.cost);
		System.out.println("=======================================================");

		vol=myClone.vol();
		System.out.println("Volume of a clone box:		"+vol);
		System.out.println("Weight of a clone box:		"+ myClone.weight);
		System.out.println("Cost of  shipment of a clone box:		"+ myClone.cost);
		System.out.println("=======================================================");


	}

}
