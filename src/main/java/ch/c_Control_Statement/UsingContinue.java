package ch.c_Control_Statement;

public class UsingContinue {

	int m;//Just to show package protected has triangular, blue sign.
	public int n;//Just to show public modifier has green dot sign. And private member has red square sign.

	public static void main(String[] args) {
//
		System.out.println("First continue is executing...........");
		continue1();

		System.out.println("Second continue is executing...........");
		continueAsJump();
	}

	private static void continueAsJump() {
		outer: for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {
				if (j > i) {
					System.out.println("");
					continue outer;
				}
				System.out.print("  " + (i * j));
			}
			System.out.println(" ");
		}

	}

	private static void continue1() {
		for (int i = 0; i < 10; i++) {
			System.out.print(" " + i);
			if (i % 2 == 0)
				continue;// This 'continue' keep the loop continue without executing the rest of the
							// loop.
			System.out.println(" ");// if if condition satisfies then this statement will not execute.
		}

	}

}
