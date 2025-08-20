package ChallengesCoreJava;

import java.util.Scanner;

public class LongestwordString {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a sentence:");
	        String str = sc.nextLine();
	        String[] words = str.split(" ");
	        String longestWord = "";  
	        for (int i = 0; i < words.length; i++) {
	            if (words[i].length() > longestWord.length()) {
	                longestWord = words[i];
	            }
	        }
	        System.out.println("The longest word is: " + longestWord); 
	        sc.close();
	    }
	}


