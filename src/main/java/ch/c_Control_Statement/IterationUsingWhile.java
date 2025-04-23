package ch.c_Control_Statement;

public class IterationUsingWhile {

	public static void main(String[] args) {
		System.out.println("======================================");
		whileForTick();
		System.out.println("======================================");
		midpoint();
		System.out.println("======================================");
		doWhile();
		System.out.println("======================================");
		doWhileMenu();

	}

	private static void doWhile() {
		int n=10;
		do {
			System.out.print("tick	"+n+" ");
			n--;
		}
		while(n>0);
	}

	private static void whileForTick() {

		int n = 10;
		while (n > 0) {
			System.out.print("Tick	" +n+" ");
			n--;
		}
	}

	private static void midpoint() {

		int i=100, j=200;

		while(++i<--j);//Loop without body.

		System.out.println("The midpoint is i/j   "+i);
	}


	private static void doWhileMenu() {



	}
}
