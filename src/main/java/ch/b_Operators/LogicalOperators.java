package ch.b_Operators;

public class LogicalOperators {

	public static void main(String[] args) {

		int a=10, b=15;
		System.out.println("a>b		:"+(a>b));
		System.out.println("a<b		:"+(a<b));
		System.out.println("a>=b/a=>b	:"+(a>=b));
		System.out.println("a<=b/a=<b	:"+(a<=b));
		System.out.println("a==b		:"+(a==b));
		System.out.println("a!=b		:"+(a!=b));

		LogicalOperators.logicalOperator();
	}


	@SuppressWarnings("unused")
	static void logicalOperator() {
		System.out.println("=============================logical && and || operator===================================");
		boolean x=true, y=false;

		System.out.println("x&&x:	"+(true&&true));
		System.out.println("y&&y:	"+(false&&false));
		System.out.println("x||x:	"+(true||true));
		System.out.println("y||y:	"+(false||false));
		System.out.println("x&&y:	"+(x&&y));
		System.out.println("x||y:	"+(x||y));

	}
}