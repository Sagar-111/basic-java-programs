package ch.c_Control_Statement;

public class SelectionIf {

	public static void main(String[] args) {
		selectionUsingIf();
		selectionUsingNestedIf();
		selectionUsingLadder();
	}

	static void selectionUsingIf() {
		int a = 10, b = 15;
		if (a > b) { // if(condition=true){execute the if-block} else{execute the else-block}
			System.out.println("a is gertter than b");
		} else {
			System.out.println("b is gretter that a");
		}
	}

	static void selectionUsingNestedIf() {
		int a = 10, b = 15, c = 20;
		a = c;

		if (b > a) { // if(condition=true){execute the if-block} else{execute the else-block}
			if (b > c) {
				System.out.println("b is gretest one");
			} else {
				System.out.println("b is gretter than a but less than c");
			}
		} else {
			System.out.println("a is gretter that b");
		}
	}

	static void selectionUsingLadder() {
		int month = 6;
		String season;
		if (month == 12 || month == 1 || month == 2)
			season = "winter";
		else if (month == 3 || month == 4 || month == 5)
			season = "spring";
		else if (month == 6 || month == 7 || month == 8)
			season = "summer";
		else if (month == 10 || month == 11 || month == 12)
			season = "autumn";

		else
			season = "Bogus month";

		System.out.println("The June month is in "+season+" season.");

	}
}
