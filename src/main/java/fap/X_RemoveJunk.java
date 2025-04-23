package fap;

public class X_RemoveJunk{

	public static void main(String[] args) {
		
		String s="Java Developer";
		
		s=s.replaceAll("\\s", "");
		
		System.out.println(s);

	}

}
