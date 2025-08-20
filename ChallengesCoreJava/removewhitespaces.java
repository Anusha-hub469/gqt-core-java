package ChallengesCoreJava;

import java.util.Scanner;

public class removewhitespaces {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string:");
	        String str = sc.nextLine();

	        // Remove all white spaces (spaces, tabs, newlines)
	        String result = str.replaceAll("\\s+", "");
            System.out.println("String after removing white spaces:");
	        System.out.println(result);
	    }
	}
