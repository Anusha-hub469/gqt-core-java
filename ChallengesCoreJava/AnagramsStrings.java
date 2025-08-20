package ChallengesCoreJava;
	import java.util.Scanner;
	public class AnagramsStrings {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter first string: ");
	        String str1 = sc.nextLine().replaceAll(" ", "").toLowerCase();
	        System.out.print("Enter second string: ");
	        String str2 = sc.nextLine().replaceAll(" ", "").toLowerCase();
	        if (str1.length() != str2.length()) {
	            System.out.println("Strings are not anagrams.");
	            return;
	        }
	        for (int i = 0; i < str1.length(); i++) {
	            char ch = str1.charAt(i);
	            if (!str2.contains(String.valueOf(ch))) {
	                System.out.println("Strings are not anagrams.");
	                return;
	            }
	            str2 = str2.replaceFirst(String.valueOf(ch), "");
	        }
	        if (str2.isEmpty()) {
	            System.out.println("Strings are anagrams.");
	        } else {
	            System.out.println("Strings are not anagrams.");
	        }

	        sc.close();
	    }
	}
