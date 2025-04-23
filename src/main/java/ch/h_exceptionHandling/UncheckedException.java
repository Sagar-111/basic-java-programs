package ch.h_exceptionHandling;

public class UncheckedException {

	public static void main(String[] args) {
		stringLength(null);//throw NullPointerException, if kept unhandled, you can handle it using try-catch as a good practice to do so.
//		throw new NullPointerException();	Instead of NPE you cannot use Exception.
	}

	private static void stringLength(String string){
		System.out.println(string.length());
		
	}

}
