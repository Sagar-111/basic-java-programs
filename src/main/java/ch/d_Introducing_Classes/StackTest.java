package ch.d_Introducing_Classes;

public class StackTest {

	public static void main(String[] args) {

		Stack myStack1 = new Stack();
		Stack myStack2 = new Stack();

//		Put element to the stack.
		for (int i = 0; i < 10; i++)
			myStack1.push(i);
		for (int i = 10; i < 20; i++)
			myStack2.push(i);

//		Pop element out of stack.
		System.out.println("stack in mystack 1");
		for (int i = 0; i < 10; i++)
			System.out.println(myStack1.pop());

		System.out.println("stack in mystack 1");
		for (int i = 0; i < 10; i++)
			System.out.println(myStack2.pop());
	}

}
