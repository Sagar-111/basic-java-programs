package ch.a_Data_Types_Var_Arr;

public class DataTypes {
	
	int number;	//Instantaneous variable. 
	static int number1;	//Class variable. If not initialized take default value and modifiable. This is common to all object.


	public static void main(String[] args) {

//		Primitive data type.
		int myInt=50;
		double myDub=1.26e10;
		float myFloat= 0.23e-2f;
		long myLong=1456^5l;
		char myChar='D';
		boolean myBool=true;
//		short, byte


		System.out.println("integer		"+myInt);
		System.out.println("foat		"+myDub);
		System.out.println("double		"+myFloat);
		System.out.println("long		"+myLong);
		System.out.println("char		"+myChar);
		System.out.println("boolean		"+myBool);
		
		DataTypes.number1=0;
//		DataTypes.number1=2;
//		DataTypes.number1=3;
		//This is the class variable as it is declared static it belongs to class itself rather than the object(Instance) of a class
//		class variables (also known as static variables) are automatically initialized with default values if you don't explicitly assign them a value.
		/*
		 * Class variables are variables declared with the static keyword within a
		 * class. They belong to the class itself rather than to instances of the class.
		 * There is only one copy of a class variable regardless of how many instances
		 * (objects) of the class are created. Class variables are shared among all
		 * instances of the class. They are typically used to store data that is common
		 * to all instances of the class. Class variables are accessed using the class
		 * name, not through instances of the class.
		 */
		
		DataTypes dv = new DataTypes();
		
		dv.number=90;
//		dv.number=26;
//		dv.number=23;
		/*
		 * Instance variables are variables declared in a class but outside of any
		 * method, constructor, or block. They belong to individual instances (objects)
		 * of the class. Each instance of the class has its own copy of instance
		 * variables. Instance variables represent the state of individual objects. They
		 * are accessed and modified using instances (objects) of the class.
		 */
	}

}
