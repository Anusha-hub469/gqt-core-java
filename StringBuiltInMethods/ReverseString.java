package StringBuiltInMethods;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String:");
		String str = sc.nextLine();
		String res = "";
		for(int i=str.length()-1;i>=0;i--) {
			res = res + str.charAt(i);
		}
		System.out.println("The resultant String is="+res);
		

	}

}
