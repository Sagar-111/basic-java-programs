package ch.h_exceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {

		
		try {
			int myInt=Integer.parseInt("12");
			
			System.out.println("The statement after Occurence of the exception will not excute IF Exception occures"+myInt
					);
		}
//		If there can be more than one kind of exception expected then you cab put multiple catch block to catch this different types.
//		catch(NumberFormatException nfe){
//			System.out.println("Message to the programmer: you can't do that!");
//		}
//		catch(NullPointerException nfe){
//			System.out.println("Message to the programmer: you can't do that!");
//		}
		
//		Multy-catch statement: You can use OR in single catch block to catch different type of Exception.
		catch(NullPointerException|NumberFormatException nfe){
			System.out.println("Message to the programmer: you can't do that!");
		}
		
		finally {
			System.out.println("The statement in the finally block should execute....");
		}
		
		System.out.println("The statement out and after the try catch block should execute....");
	}

}
