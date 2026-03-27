package jcf.map;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
Problem statement
Given a string, count the frequency of each character. Then, given a sentence, count the frequency of each word. Print both maps sorted by key.
Input:  "hello world"

Char freq:  {d=1, e=1, h=1, l=3, o=2, r=1, w=1}
Word freq:  {hello=1, world=1}
 */
public class FrequencyCount {
    public static void main(String[] args) {
        String str = "hello world hello world hello Sagar";

        System.out.println(countFreqOfWord(str));

        System.out.println(countFreqOfChar(str));
    }

    public static Map<Character, Integer> countFreqOfChar(String str) {
        Map<Character, Integer> hmp = new HashMap<>();
        char[] charArr = str.toCharArray();
        for (char c : charArr) {
            if(c==' ') continue;
            hmp.put(c, hmp.getOrDefault(c, 0) + 1);
        }
        return hmp;
    }

    public static Map<String, Integer> countFreqOfWord(String str) {
        Map<String, Integer> hmp = new HashMap<>();
        String[] strArr = str.split("\\s+");   // str.split(" "); - This will just skip only one space and consider other space as part of the string.
        for (String c : strArr) {
            if(hmp.containsKey(c)) hmp.put(c, hmp.get(c)+1);
            else hmp.put(c, 1);
        }
        return hmp;
    }
}
