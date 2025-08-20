package ChallengesCoreJava;

import java.util.Scanner;

public class LowerUpperCase {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the string:");
			String str = sc.nextLine();
			String result = "";

			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (Character.isUpperCase(ch)) {
					// Convert to lowercase
					result = result + Character.toLowerCase(ch);
				} else if (Character.isLowerCase(ch)) {
					// Convert to uppercase
					result = result + Character.toUpperCase(ch);
				} else {	
					result = result + ch;
				}
			}
			System.out.println("String after case conversion: " + result);
			sc.close();
		}
	}
