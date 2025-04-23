package prcts;

public class ReverseAlphaNumericString {

    public static void main(String[] args) {
        String str = "sa12gar2";
        StringBuilder alphaOnly = new StringBuilder();
        
        // Extract alphabetic characters
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                alphaOnly.append(ch);
            }
        }
        
        // Reverse the alphabetic characters
        alphaOnly.reverse();
        
        StringBuilder result = new StringBuilder();
        int i = 0;
        
        // Reconstruct the string with reversed alphabetic characters
        for (char ch : str.toCharArray()) {
            if(!Character.isDigit(ch)) {
            	result.append(alphaOnly.charAt(i));
            	i++;
            }else {
            	result.append(ch);
            }
        }
        
        System.out.println(result.toString());
    }
}
