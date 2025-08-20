package StringBuiltInMethods;

import java.util.Scanner;

public class sumofcapitalsmallvowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String:");
		String str = sc.nextLine();
		int uppercaseVowelSum = 0;
		int lowercaseVowelSum = 0;
		long consonantProduct = 1;
		boolean hasConsonant = false;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
				uppercaseVowelSum = uppercaseVowelSum + ch;
			} else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				lowercaseVowelSum = lowercaseVowelSum + ch;
			} else if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
				// it's a consonant (alphabetic but not a vowel)
				consonantProduct = consonantProduct * ch;
				hasConsonant = true;
			}
		}

		System.out.println("Sum of capital vowels = " + uppercaseVowelSum);
		System.out.println("Sum of small vowels = " + lowercaseVowelSum);

		if (hasConsonant) {
			System.out.println("Product of consonants = " + consonantProduct);
		} else {
			System.out.println("No consonants found.");
		}
	}
}