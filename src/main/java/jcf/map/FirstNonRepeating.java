package jcf.map;


import java.util.*;

/*
Problem statement
Given a string, find the first character that does not repeat. Use a LinkedHashMap to preserve insertion order. Return the character and its index.
Input:  "swiss"
Output: First non-repeating = w (index 1)
 */
public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "swiss";
        Optional<Character> result = findFirstNonRepeating(str);

        result.ifPresentOrElse(
                c -> System.out.println("First non-repeating: " + c),
                () -> System.out.println("No non-repeating character found")
        );
    }

    private static Optional<Character> findFirstNonRepeating(String str) {

        Map<Character, Integer> hmp = new LinkedHashMap<>();
        char[] charArr = str.toCharArray();
        for (char c : charArr) {
            if(c==' ') continue;
            hmp.put(c, hmp.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : hmp.entrySet()) {
            if (entry.getValue() == 1) {
                return Optional.of(entry.getKey());
            }
        }

        return Optional.empty();
    }
}
