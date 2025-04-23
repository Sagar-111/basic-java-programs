package ch.e_A_Closer_Look_At_Method_And_Classes;

public class ForObjectAsParameter {
	public static void main(String[] args) {

		ObjectAsParam emptyBox = new ObjectAsParam();
		ObjectAsParam cuboidBox = new ObjectAsParam(16, 17, 18);
		ObjectAsParam cubBox = new ObjectAsParam(19);

		double volumeOfEmptyBox = emptyBox.volume();
		System.out.println("Volume Of Empty Box:	" + volumeOfEmptyBox);

		double volumeOfCuboid = cuboidBox.volume();
		System.out.println("Volume Of Cuboid:	" + volumeOfCuboid);

		double volumeOfCube = cubBox.volume();
		System.out.println("Volume Of cube:		" + volumeOfCube);

		ObjectAsParam objBox = new ObjectAsParam(cubBox);
		double volumeOfObjectBox = objBox.volume();
		System.out.println("Here a copy constructor of cube box is created is created:	" + volumeOfObjectBox);

	}

}
