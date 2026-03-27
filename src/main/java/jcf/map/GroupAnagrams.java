package jcf.map;

/*
Problem statement
Given an array of strings, group all anagrams together. Two strings are anagrams if they contain the same characters in any order. Return a list of groups.

Input:  ["eat","tea","tan","ate","nat","bat"]
Output: [[eat, tea, ate], [tan, nat], [bat]]
 */

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("eat","tea","tan","ate","nat","bat"));

        method1(words);

        method2(words);
    }

    private static void method2(List<String> words) {

        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            int[] freq = new int[26];

            for (char c : word.toCharArray()) {
                freq[c - 'a']++;
            }

            String key = Arrays.toString(freq);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        List<List<String>> result = new ArrayList<>(map.values());

        System.out.println(result);
    }

    private static void method1(List<String> words) {
        Map<String, List<String>> map = new HashMap<>();

        for(String word:words){
            char[] key = word.toCharArray();
            Arrays.sort(key);

            String str = new String(key);

            map.putIfAbsent(str, new ArrayList<>());

            map.get(str).add(word);
        }

        List<List<String>> result = new ArrayList<>(map.values());

        System.out.println(result);
    }

}
