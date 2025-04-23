package ch.c_Control_Statement;

public class IterationUsingForEachLoop {
	public static void main(String[] args) {
		forEachLoop();
		sumOfNum();
	}

	private static void sumOfNum() {

		int[] num= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int number:num) {
			sum=sum+number;
			System.out.println("after adding:	"+ number);
			System.out.println("Addition is equal to:	"+sum);
		}

	}

	private static void forEachLoop() {

		int[] numbers = { 1, 2, 3, 4, 5 };

		// Using for-each loop to print each element of the array
		for (int num : numbers) {
			System.out.print(num);
			System.out.print("   ");
		}
	}
}
