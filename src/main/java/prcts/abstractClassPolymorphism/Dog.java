package prcts.abstractClassPolymorphism;

public class Dog extends Animal{

	@Override
	public void makeSound() {
		System.out.println("dog......dog..........");
	}

	@Override
	public void poop(){
		System.out.print("shit..shit...");
	}

}
