package fap;

import java.util.*;

public class ZK_AnagramChecker{
	public static void main(String[] args) {
		String strOne = "Sager";
		String strTwo = "ragas";

		System.out.println("The given Strings are anagram? : "+checkAnagram2(strOne.toLowerCase(), strTwo.toLowerCase()));
	}

	private static boolean checkAnagram2(String strOne, String strTwo) {
		if(strTwo.length()!=strOne.length()) return false;

		Map<Character, Integer> map = new HashMap<>();

		for(char c:strOne.toCharArray()) map.merge(c, 1, Integer::sum);

		return true;
	}

	private static boolean checkAnagram(String strOne, String strTwo) {
		int[] arr = new int[26];

		if(strTwo.length()!=strOne.length()) return false;

		for(char c:strOne.toCharArray()) arr[c-'a']++;
		for(char c:strTwo.toCharArray()) arr[c-'a']--;
		for(int i:arr) if(arr[i]!=0) return false;
		return true;
	}
}
