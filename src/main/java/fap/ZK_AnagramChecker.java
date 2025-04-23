package fap;

public class ZK_AnagramChecker {

	public static void main(String[] args) {

		boolean status = checkAnagram("raynaan", "narayan");

		System.out.println(status);

	}

	private static boolean checkAnagram(String string, String string1) {
		String str1 = string.toLowerCase();
		String str2 = string1.toLowerCase();

		boolean flag = false;
		if (str1.length() != str2.length()) {
			return flag;
		} else {
			for (int i = 0; i < str1.length(); i++) {
				String ch = String.valueOf(str1.charAt(i));
				if (str2.contains(ch) == true) {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			return flag;
		}

	}
}
