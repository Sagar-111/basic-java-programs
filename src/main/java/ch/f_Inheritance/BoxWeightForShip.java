package ch.f_Inheritance;

public class BoxWeightForShip extends Box {


	double weight;
//	Constructor clone.
	BoxWeightForShip(BoxWeightForShip ob){
		super(ob);
		weight=ob.weight;

	}

//	Constructor when all dimension are specified.
	BoxWeightForShip(double height, double width, double depth, double weight){
		super(height, width, depth);
		this.weight=weight;
	}

//	Constructor When cube is constructed.
	BoxWeightForShip(double length, double weight){
		super(length);
		this.weight=weight;
	}

//	Constructor default.
	BoxWeightForShip(){
		super();
		weight=-1;
	}
}
