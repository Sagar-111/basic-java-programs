package ch.f_Inheritance;

public class Box {

	double height;
	double width;
	double depth;

//	constructor clone of an object.
	Box(Box ob) {
		height = ob.height;
		width = ob.width;
		depth = ob.depth;
	}

//	Constructor used when all dimension are specified.
	Box(double height, double width, double depth) {
		this.height = height;
		this.width = width;
		this.depth = depth;
	}

//	Constructor used when no dimension are specified.
	Box() {
		this.height = -1;
		this.width = -1;
		this.depth = -1;
	}

//	Constructor when the box is a cube.
	Box(double length) {
		height = width = depth = length;
	}

//	To calculate volume of a box.
	double vol() {
		return height * width * depth;
	}

}
