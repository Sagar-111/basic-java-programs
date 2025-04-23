package prcts;

public class SpecialCharactersPrinter {
    public static void main(String[] args) {
        // ASCII values for printable special characters are from 32 to 126
        for (int i = 32; i <= 126; i++) {
            char character = (char) i;
            // Print only if it's a special character
            if (!Character.isLetterOrDigit(character) && !Character.isWhitespace(character)) {
                System.out.println("Character: " + character + " ASCII Value: " + i);
            }
        }
    }
}
