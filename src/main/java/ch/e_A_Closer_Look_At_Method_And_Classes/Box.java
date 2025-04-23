package ch.e_A_Closer_Look_At_Method_And_Classes;

public class Box {

	double height;
	double width;
	double depth;

//	Constructor when default constructor is called.
	Box() {
		height = -1;
		width = -1;
		depth = -1;
	}

//	Constructor setting all dimensions.
	Box(double height, double width, double depth) {
		this.height = height; // this.instance_variable=local_variable;
		this.depth = depth; // To avoid instance variable hiding even if the names are same.
		this.width = width;
	}

//	Constructor when all dimension are equal or it is a cube.
	Box(double length) {
		height = width = depth = length;
	}

//	Method for calculating volume.
	double volume() {
		return (height * width * depth);
	}

}
