package ch.a_Data_Types_Var_Arr;

//All executable code in Java needs to be inside a method, constructor, or initializer block.

public class ScopeAndLife {

	static int x = 12;
	int z = 1561;

	static {
		System.out.println("static block intiated at very first");
	}

	public void scopeOfVariable(int y) {
		x = 54; // x is accessible as it's scope is global.
		y = 15;
		System.out.println("x   from non-static method  " + x);// x has a global scope, as it is static.
		System.out.println("y  " + y);// y has no life beyond this block as it is local variable of this block.
		System.out.println("z  " + z); // z is accessible to the methods which are non-static in nature directly.
		System.out.println("x+y+z   " + (x + y + z));
	}

	public static void main(String[] args) {

		System.out.println("x   from static method  " + x);// x has a global scope, as it is static.
//		System.out.println("z  " + z);// z has no scope here directly, to put it in use you have to create an object of a this class.

		ScopeAndLife obj = new ScopeAndLife();
		obj.z = 4; // as z is accessible through an object, y can't be accessed.
		obj.scopeOfVariable(15); // non-static method call it by obj, if it is static call it directly wit class name.
		System.out.println("x   manipulated " + x);

	}

}
