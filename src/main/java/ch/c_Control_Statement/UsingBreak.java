package ch.c_Control_Statement;

public class UsingBreak {

	public static void main(String[] args) {

		breakToJumpOutLoop();
		System.out.println(
				"=====================================================================================================================================================");
		breakAsGoTO();

	}

	private static void breakAsGoTO() {

		outer: for (int i = 0; i < 3; i++) {
			System.out.println("This loop will execute three times if it does't break in between:	" + i + " th time");
			for (int j = 0; j < 100; j++) {
				System.out.println("The numbers before jumping out the \"100\" numbers loop:	" + j);
				if (j >= 15)
					break outer;
			}
		}
		System.out.println(
				"Thrown out of outer loop becaouse of occurence of \"break outer;\". And hence this statement is executing ");
	}

	private static void breakToJumpOutLoop() {
		for (int i = 0; i < 100; i++) {
			System.out.println("The numbers before jumping out the \"100\" numbers loop:	" + i);
			if (i >= 15) {
				System.out.println("After this no numbers will be printed as the loop is terminated by \"break;\" ");
				break;
			} // in case nested loops: The break; will just through the control out of the
				// current loop only.

		}

	}

}
