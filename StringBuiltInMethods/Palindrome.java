package StringBuiltInMethods;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String:");
		String str = sc.nextLine();
		String res = "";
		for(int i=str.length()-1;i>=0;i--) {
			res = res + str.charAt(i);
		}
		System.out.println("The resultant String is="+res);
		
		if(str.equals(res)==true) {
			System.out.println("is a palindrome");
		}
		else {
			System.out.println("is not a palindrome");
		}
		

	}

}