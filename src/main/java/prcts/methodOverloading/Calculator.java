package prcts.methodOverloading;

public class Calculator {

	public double sum(int num1, int num2) {
		return num1 + num2;
	}

	public double sum(int num1, int num2, double num3) {
		return num1 + num2 + num3;
	}

	public double sum(int num1, double num2) {
		return num1 + num2;
	}

	public double sum(int[] arr) {

		double sum = 0;
		for (int i = 0; i < arr.length; i++) {

			sum = sum + arr[i];
		}

		return sum;
	}
}
