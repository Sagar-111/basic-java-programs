package prcts;

import java.util.HashSet;

public class StringPermutation {
//	Combination of n element selecting r at a time. nCr = n! / r! * (n - r)!
//	Permutation of n element selecting r at a time. with repetition n^r, without repetition nPr = n! / (n - r)!

	public static void main(String[] args) {
		String input = "abc";
		HashSet<String> result = permute(input);
		System.out.println(result);
	}

	private static HashSet<String> permute(String input) {
		HashSet<String> hs = new HashSet<String>();
		return hs;
	}
}
