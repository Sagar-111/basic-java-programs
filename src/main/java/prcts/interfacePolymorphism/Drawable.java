package prcts.interfacePolymorphism;

interface Drawable {

	default void draw() {
		System.out.println("Default method");
	}

//	static void draw() {	You cannot override the static methods.
//		System.out.println("Default method");
//	}
}
