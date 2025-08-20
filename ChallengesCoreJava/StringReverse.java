package ChallengesCoreJava;

import java.util.Scanner;
public class StringReverse {
		    public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a sentence: ");
		        String str = sc.nextLine();  
		        String[] words = str.split(" ");  
		        System.out.print("Reversed sentence: ");
		        for (int i = words.length - 1; i >= 0; i--) {
		            System.out.print(words[i] + " ");
		        }
		        sc.close();
		    }
		}
