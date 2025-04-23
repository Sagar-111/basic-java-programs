package fap;

public class Y_RemoveWhiteSpaces{

	public static void main(String[] args) {
		
		String s="$#^#&@^ Java $^#% Developer";
		
		s=s.replaceAll("[^a-zA-Z0-9 ]", "");
		
		System.out.println(s);

	}

}
