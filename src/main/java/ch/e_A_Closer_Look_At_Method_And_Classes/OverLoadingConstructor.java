package ch.e_A_Closer_Look_At_Method_And_Classes;

public class OverLoadingConstructor {

	public static void main(String[] args) {

		Box emptyBox = new Box();
		Box cuboidBox = new Box(16, 17, 18);
		Box cubBox = new Box(19);

		double volumeOfEmptyBox = emptyBox.volume();
		System.out.println("Volume Of Empty Box:	" + volumeOfEmptyBox);
		double volumeOfCuboid = cuboidBox.volume();
		System.out.println("Volume Of Cuboid:	" + volumeOfCuboid);
		double volumeOfCube = cubBox.volume();
		System.out.println("Volume Of cube:		"+volumeOfCube);

	}

}
