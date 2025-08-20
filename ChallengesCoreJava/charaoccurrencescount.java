package ChallengesCoreJava;

import java.util.Scanner;

public class charaoccurrencescount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  string:");
		String str = sc.nextLine();
		 System.out.println("Enter the character to count:");
	     char ch = sc.next().charAt(0); 
		int char_count = 0;
		for(int i=0;i<str.length();i++) {
			 if (str.charAt(i) == ch) {
	                char_count++;
	            }
	        }

	        System.out.println("Character '" + ch + "' occurs " + char_count + " times.");
	        sc.close();
	    }
	}