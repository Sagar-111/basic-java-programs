package ch.f_Inheritance;

class Aa {
	int i = 12, j = 15;

	void show() {
		System.out.println("i, j:	" + i + " " + j);
	}

}

class Bb extends Aa {

	int k = 49;

	@Override
	void show() {
		super.show();//If you want to invoke the overridden method.
		System.out.println("k;	"+k);
	}

}

public class MethodOverriding {

	public static void main(String[] args) {

	 Bb ob = new Bb();
		ob.show();//This method overrides identical method from class Aa.
	}
}
