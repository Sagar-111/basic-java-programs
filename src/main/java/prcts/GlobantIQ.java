package prcts;

public class GlobantIQ {

	public static void main(String[] args) {
		String str = "This is India";
		
		str.concat(", and I'm proud to be an Indian"); //As .concate() returns new reference to the String so object str is unchanged.
		
		String[] arr = str.split(" ");

		String output = "";

		for (int i = 0; i < arr.length; i++) {
			for (int j = arr[i].length() - 1; j >= 0; j--) {
				output = output + arr[i].charAt(j);
			}
			output = output + " ";
		}
		
		System.out.println(output);
		
		
		GlobantIQ obj1 = new GlobantIQ();
		GlobantIQ obj2 = new GlobantIQ();
		
		System.out.println("obj1.equals(obj2) "+obj1.equals(obj2));
		System.out.println("obj1 == obj2 " + (obj1 == obj2));
	}

}
