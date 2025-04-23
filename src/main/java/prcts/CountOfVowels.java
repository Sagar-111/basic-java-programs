package prcts;

public class CountOfVowels {

	public static void main(String[] args) {
		String[] strArr = { "priyanka", "swati", "archana", "hevin" };

		String vowels = "AEIOUaeiou";

		int countOfTotalVowelsInArray = 0;

		for (String str : strArr) {

			int countOfVowel = 0;

			for (char ch : str.toCharArray()) {
				if (vowels.indexOf(ch) != -1) {
					countOfVowel++;
				}
			}

			System.out.println(str + "->" + countOfVowel);

			countOfTotalVowelsInArray = countOfTotalVowelsInArray + countOfVowel;
		}
		System.out.println(countOfTotalVowelsInArray);
	}

}
