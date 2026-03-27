package prcts;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

    public static Character firstNonRepeating(String s) {
        if (s == null || s.isEmpty()) return null;

        // Step 1: Build frequency map (insertion order preserved)
        LinkedHashMap<Character, Integer> freqMap = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        // Step 2: Return first character with count == 1
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null; // No non-repeating character found
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeating("swiss"));   // w
        System.out.println(firstNonRepeating("aabbcc"));  // null
        System.out.println(firstNonRepeating("aabbc"));   // c
        System.out.println(firstNonRepeating("z"));       // z
        System.out.println(firstNonRepeating(""));        // null
    }
}