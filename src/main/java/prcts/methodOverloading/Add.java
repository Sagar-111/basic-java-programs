package prcts.methodOverloading;

public class Add {

	public static void main(String[] args) {
		Calculator calc = new Calculator();

		double sum1 = calc.sum(5, 4, 3);

		double sum2 = calc.sum(5, sum1);

		double sum3 = calc.sum(5, 12);

		int[] arr = { 1, 2, 3, 4, 5 };

		double sum4 = calc.sum(arr);

		System.out.println("Sum :" + sum1);
		System.out.println("Sum :" + sum2);
		System.out.println("Sum :" + sum3);
		System.out.println("Sum :" + sum4);

	}

}
