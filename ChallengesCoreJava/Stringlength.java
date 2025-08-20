package ChallengesCoreJava;


import java.util.Scanner;

public class Stringlength {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string:");
		String str = sc.nextLine();
		
	    int length = str.length(); 
	    
        System.out.println("the length of the String is: " + length);
        sc.close();
	}

}
