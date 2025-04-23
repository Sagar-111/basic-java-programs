package prcts.abstractClassPolymorphism;

public class Sound {
	public static void main(String[] args) {
		Animal c = new Cat();
		Animal d = new Dog();
		
		Animal[] ob = {c, d};
		
		for (Animal o:ob) {
			o.makeSound();
		}
		
	}

}
