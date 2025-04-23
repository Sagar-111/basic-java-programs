package ch.a_Data_Types_Var_Arr;

public class ConversionAndCasting {

	public static void main(String[] args) {
		/*
		 * Conversion: Implicit type conversion (widening or promotion) happens
		 * automatically when a smaller data type is converted to a larger data type
		 * without the risk of losing data.
		 *byte<short<int<long<float<double
		 */

		int smallNumber = 10;
		double largerNumber = smallNumber; // Implicit conversion from int to double
		System.out.println("smallNumber   " + smallNumber);// 10
		System.out.println("small(int) converted into largerNumber(double)   " + largerNumber);// 10.0
		/*
		 * Explicit type conversion (narrowing or demotion) requires manual intervention
		 * and is performed by the programmer when converting a larger data type to a
		 * smaller one, potentially leading to data loss.
		 */

		double bigNumber = 25.7;
		int smallerNumber = (int) bigNumber; // Explicitly casting double to int
		System.out.println("bigNumber   " + bigNumber);// 25.7
		System.out.println("bigNumber(double) converted into smallerNumber(int)   " + smallerNumber);// 25

//		Casting/Explicit conversion.
		/*
		 * Casting is done by specifying the desired data type in parentheses before the
		 * value to be converted. When narrowing data types (e.g., converting from a
		 * larger type to a smaller one), potential loss of precision or information
		 * might occur.
		 */

		// Casting double to int, data loss of decimal part
		double num1 = 10.5;
		int num2 = (int) num1;
		System.out.println("nim1  " + num1);
		System.out.println("casting num1 to nim2  " + num2);

		// Converting String to int using parseInt() method.--Integer.parseInt(String
		// str)
		String numberStr = "123";
		int number = Integer.parseInt(numberStr);
		System.out.println("numberStr  " + numberStr);
		System.out.println("nimstr to number  " + number);

		// Converting String to double using parseDouble()
		// method.---Double.parseDouble(String str)
		String numstring1 = "445";
		double dubNum = Double.parseDouble(numstring1);
		System.out.println("numstring1  " + numstring1);
		System.out.println("numstring1 to Double  " + dubNum);

		// Boolean.parseBoolean(String str)
		String boolStr = "true";
		boolean boolValue = Boolean.parseBoolean(boolStr);		//true.
		System.out.println("String  "+boolStr);
		System.out.println("boolean    "+boolValue);

		char ch = 'A';
		String charString = Character.toString(ch);
		System.out.println("Char  "+ch);
		System.out.println("String    "+charString);

		String lowerCase = "hello";
		String upperCase = lowerCase.toUpperCase();
		System.out.println("lowerCase  "+lowerCase);
		System.out.println("upperCase    "+upperCase);

		String upperCase1 = "HELLO";
		String lowerCase2 = upperCase1.toLowerCase();
		System.out.println("upperCase1  "+upperCase1);
		System.out.println("lowerCase2    "+lowerCase2);
	}

}
