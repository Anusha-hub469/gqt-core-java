package ChallengesCoreJava;

import java.util.Scanner;

public class concatenateStrings {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string-1:");
		String str1=sc.nextLine();
		System.out.println("enter the string-2:");
		String str2=sc.nextLine();
		String result=str1+str2;
		System.out.println("concatenate string=" + result);
	}
}