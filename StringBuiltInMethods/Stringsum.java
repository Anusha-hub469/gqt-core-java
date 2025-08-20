package StringBuiltInMethods;

import java.util.Scanner;

public class Stringsum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the String:");
		String str = sc.nextLine();
		int sum = 0;
		for(int i=0;i<str.length();i++) {
			sum = sum + str.charAt(i);
			
		}
		System.out.println("sum is="+sum);
		

	}

}
