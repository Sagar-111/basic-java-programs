package ch.e_A_Closer_Look_At_Method_And_Classes;

public class CallByVAndR {

	public static void main(String[] args) {
		System.out.println("==================================CALL BY VALUE===================================");

		CallByValue cbvOBJ = new CallByValue();
		int a = 15, b = 20;
		System.out.println("a and b before:		" + a + "  " + b);

		cbvOBJ.meth(a, b);
		System.out.println("a and b After operation are perform on them:		" + a + "  " + b);

		System.out.println("==================================CALL BY REFERENCE===================================");

		CallByRef cbrOBJ = new CallByRef(15, 20);
		System.out.println("a and b before:		" + cbrOBJ.a + "  " + cbrOBJ.b);

		cbrOBJ.meth(cbrOBJ);
		System.out.println("a and b After operation are perform on them:		" + cbrOBJ.a + "  " + cbrOBJ.b);
	}

}
