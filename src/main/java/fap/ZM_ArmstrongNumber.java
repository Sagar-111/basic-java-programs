package fap;

public class ZM_ArmstrongNumber {
	public static void main(String[] args) {
		boolean status = findForArmstrongNumber(257);	//153.
		System.out.println(status);
	}

	public static boolean findForArmstrongNumber(int num) {

		int originalNum = num;

		int digits = String.valueOf(num).length();

		double sum = 0;

		while (num != 0) {
			int rem = num % 10;
			num = num / 10;
			sum = sum + Math.pow(rem, digits);
		}

		return originalNum == sum;
	}
}
