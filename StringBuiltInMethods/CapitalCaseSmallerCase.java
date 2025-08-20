package StringBuiltInMethods;

import java.util.Scanner;

public class CapitalCaseSmallerCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		int Uppercasevowels = 0;
		int Lowercasevowels = 0;
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i); 
				if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U') {
					Uppercasevowels++;
				}
				else if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
							Lowercasevowels++;
						}
						
			}
		System.out.println("number of Uppercase vowels = "+Uppercasevowels);
		System.out.println("number of Lowercase vowels = "+Lowercasevowels);

	}


		}


