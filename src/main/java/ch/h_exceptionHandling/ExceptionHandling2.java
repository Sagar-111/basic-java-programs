package ch.h_exceptionHandling;

public class ExceptionHandling2 {

	public static void main(String[] args) {

		
		try {
			parsingToInt("bub");
			
			System.out.println("The statement after Occurence of the exception will not excute IF Exception occures");
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
			parsingToInt("15");
			System.out.println("The statement in the finally block should execute if no exception thrown. If occures then need to use try-catch again");
		}
		
		System.out.println("The statement out and after the try catch block should execute....");
	}

	private static Integer parsingToInt(String str) {
		int myInt=Integer.parseInt(str);
		return myInt;
	}

}
