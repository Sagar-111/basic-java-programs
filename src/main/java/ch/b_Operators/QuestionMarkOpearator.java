package ch.b_Operators;

public class QuestionMarkOpearator {

	public static void main(String[] args) {

		/*expression_1 ? expression_2 : expression_3
		 * It works as if-then-else statement
		 * works on boolean values if expression_1 is true, then expression_2 is evaluated and if expression_1 is false then expression_3 is evaluated. */
		int a=10, b=15;
		boolean x=(a>b);
		boolean y=!x;
		String result1=(x) ? "x is greter than y" : "y is greter than x";
		System.out.println(result1);

		String result2=(y) ? "x is greter than y" : "y is greter than x";
		System.out.println(result2);
	}

}
