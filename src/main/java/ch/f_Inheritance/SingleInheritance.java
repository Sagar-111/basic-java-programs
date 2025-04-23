package ch.f_Inheritance;
//Shows member access and simple inheritance.
class SuperA {
	int i, j;
	private int l;//private to SuperA cannot be inherited by any other class but can be access through method of SuperA.

	void showij() {
		System.out.println("i, j,  l:	" + i + " " + j+" "+l);
	}

	int setl(int x) {
		return l=x;
	}
}

class SubB extends SuperA {

	int k;

	void showk() {
		System.out.println("k:	" + k);
	}

	void sum() {
		System.out.println("Sum of i, j, k=		" + (i + j + k));//(i + j + k+ l) will show error!
	}

}

public class SingleInheritance {

	public static void main(String[] args) {

		SuperA superobj = new SuperA();

		SubB subObj = new SubB();

		System.out.println("Content of super class........");
		superobj.i = 40;
		superobj.j = 50;
//		superobj.l=70;Shows compilation error as it is not accessible.
		superobj.showij();
		System.out.println("----------------------------------------------------------");
		System.out.println("Content of sub class along with inherited once........");
		subObj.i = 10;
		subObj.j = 20;
		subObj.k = 30;
		System.out.println("l is set through subclass object though it is private member of super class l:	"+subObj.setl(60));


		subObj.showij();
		subObj.showk();
		System.out.println("Sum of i,j,k from subclass");
		subObj.sum();
	}
}