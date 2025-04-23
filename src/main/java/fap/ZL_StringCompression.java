package fap;

public class ZL_StringCompression {

	public static void main(String[] args) {
//		The string "aabcccccaaa" would become "a2b1c5a3". If the compressed string would not become smaller than the original string, your method should return the original string.

		String originalString = "abbcd";
		String result = compressString(originalString);
		if (originalString.length() < result.length()) {
			System.out.println("Since original string is shorter than the modified on hence resultant string is : "
					+ originalString);
		} else {
			System.out.println("The resultant string is : " + result);

		}

	}

	private static String compressString(String string) {
		String modifiedString = "";

		for (int i = 0; i < string.length();) {
			int count = 1;
			char ch = string.charAt(i);
			for (int j = i + 1; j < string.length(); j++) {
				if (string.charAt(j) == ch) {
					count++;
				} else {
					break;
				}
			}
			i = i + count;
			modifiedString = modifiedString + ch + count;
		}
		return modifiedString;
	}
}
