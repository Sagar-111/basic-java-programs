package prcts.dynamicMethodDispatchPolymorphism;

public class Salary {

	public static void main(String[] args) {
		Employee mngr = new Manager();
		Employee dev = new Developer();

		Employee[] ob = { mngr, dev };

		for (Employee e : ob) {

			e.calculateSalary();
		}

	}

}
