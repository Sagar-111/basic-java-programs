package prcts;

public class SpecialCharacterPrinter {

	public static void main(String[] args) {
		
		for (int i = 32; i <= 126; i++) {
			char chracter = (char)i;
			// Check if the character is a special character
			if (!Character.isLetterOrDigit(chracter) && !Character.isWhitespace(chracter)) {
				System.out.println("Character: " + (char) i + " ASCII Value: " + i);
			}
		}

	}

}
