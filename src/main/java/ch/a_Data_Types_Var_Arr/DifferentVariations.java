package ch.a_Data_Types_Var_Arr;

public class DifferentVariations {

	static int x;
			int y; //y can be accessible in non-static methods directly and in static main method using object.

	public static void main(String args[]) {

		DifferentVariations obj = new DifferentVariations();
		System.out.println(x+""+obj.y);//As instance of class is created we can access non-static variable in static main method.
	}

	void method1() {int z=10;System.out.println(x+y+z);}//You can't access the z except this method cause its life ends beyond this block.
	void method2() {System.out.println(x+y);}
	static void method3(){@SuppressWarnings("unused")
	int j=23;System.out.println(x);}/*y can't be recognized here because we are trying to access non static member in static member, because all static method will execute before creation of copy of that variable so we can't use that."*/
	static void methd4() {System.out.println(x);}/*y can't be recognized here because we are trying to access non static member in static member, because all static method will execute before creation of copy of that variable so we can't use that."*/
}
