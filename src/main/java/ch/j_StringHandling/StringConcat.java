package ch.j_StringHandling;

public class StringConcat {
	
	public static void main(String[] args) {
		
		String str = "Sagar Choudhari knows java programming";
		
		String[] split = str.split(" ");
		
		char charAt1 = split[0].charAt(0);
		char charAt2 = split[1].charAt(0);
		
		String remStatement = "";
		
		for (int i = 2; i < split.length; i++) {
			remStatement = remStatement + split[i]+ " ";
		}
		
		System.out.println(charAt1+" "+charAt2+" "+remStatement);
	}
}
