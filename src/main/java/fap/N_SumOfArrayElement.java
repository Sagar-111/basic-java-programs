package fap;


public class N_SumOfArrayElement {

	public static void main(String[] args) {

		double[] elements = { 12.76, 18.01, 72.15, 0.24, 11 };
		
		

		double sum=0;
		
//		APPROACH__1
//		Iterate using for loop.
		for (int i = 0; i < elements.length; i++) {

			sum=sum+elements[i];			
		}
		System.out.println("The sum of Array Elements is=	"+sum);
		
		
//		APPROACH__2
//		Iterate using for-each loop
		sum=0;
		
		for(double a:elements) {
			
			sum=sum+a;
		}
		
		System.out.println("The sum of Array Elements is=	"+sum);
	}

}
