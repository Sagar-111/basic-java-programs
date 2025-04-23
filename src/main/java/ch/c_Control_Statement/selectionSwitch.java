package ch.c_Control_Statement;

public class selectionSwitch {

	public static void main(String[] args) {
		simpleSwitch();
		misssingBreak();
		season();
		stringSwitch();
	}

	static void simpleSwitch() {
		System.out.println("===================First Method============================");
		for (int i = 0; i < 5; i++) {
			switch (i) {
			case 0:
				System.out.println("The number is Zero");
				break;
			case 1:
				System.out.println("The number is One");
				break;
			case 2:
				System.out.println("The number is three");
				break;
			case 3:
				System.out.println("The number is four");
				break; // break has the effect of "Jumping out of the switch. It terminates the further
						// execution, handing over the control of the program to the next code out of
						// switch block."
			default: // If no default statement is added, then on test failure nothing will be there
						// to executed.
				System.out.println("The number is gretter that 5");

			}

		}

	}

	static void misssingBreak() {// If you omit the break keyword then execution of the program will be
									// continues.
		System.out.println("===================Second Method============================");
		for (int i = 0; i < 12; i++) {
			switch (i) {
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
				System.out.println("i is 5 ot less than 5" + "  execution for index    " + i);
				break;
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
				System.out.println("i is 10 ot less than 10" + "  execution for index    " + i);
				break;
			default:
				System.out.println("The number is greater than 10");
			}
		}
	}

	static void season() {
		System.out.println("===================Third Method============================");
		int month = 5;
		String season;
		switch (month) {
		case 12:
		case 1:
		case 2:
			season = "winter";
			break;
		case 3:
		case 4:
		case 5:
			season = "spring";
			break;
		case 6:
		case 7:
		case 8:
			season = "summer";
			break;
		case 9:
		case 10:
		case 11:
			season = "Autumn";
			break;
		default:
			season = "Bogus month";

		}
		System.out.println("The month May is in " + season + ".");
	}

	static void stringSwitch() {//It is best to switch on string only in case in which controlling data is already in string format.
		System.out.println("===================Fourth Method============================");
		String str="two";
		switch(str){
		case "one":System.out.println("One");
		break;
		case "two":System.out.println("Two");
		break;
		case "three":System.out.println("Three");
		break;
		default:System.out.println("No match");

		}
	}

}
