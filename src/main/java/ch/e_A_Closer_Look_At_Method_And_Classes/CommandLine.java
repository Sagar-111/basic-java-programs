package ch.e_A_Closer_Look_At_Method_And_Classes;

public class CommandLine {

	public static void main(String[] args) {


		for (int i = 0; i < args.length; i++) {
			System.out.println("args["+i+"]: "+args[i]);
		}
	System.out.println("I like the fruite:	"+args[0]);
	}

}
