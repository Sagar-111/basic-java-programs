package ch.d_Introducing_Classes;

public class BoxConstructorParamThis {

	double height;
	double width;
	double depth;

	BoxConstructorParamThis(double height, double width, double depth){
		System.out.println("Constructing a Box..........");
		this.height=height;
		this.width=width;
		this.depth=depth;
//		x=local_variable_from_the_constructor_Which_refer_to_specific_Object_of_class.
//		y=Instance_variable_from_the_class.
//		x=y We do this To avoid instance variable hiding by the local variables even if assigned name of variables are same.
	}

	public double volume() {
		double vol=(this.height*this.width*this.depth);
		return vol;
	}
}
