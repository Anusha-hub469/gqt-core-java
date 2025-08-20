package ChallengesCoreJava;
import java.util.Scanner;
public class Stringsdigits {
	    	    public static void main(String[] args) {
	    	        Scanner sc = new Scanner(System.in);
	    	        System.out.print("Enter a string: ");
	    	        String str = sc.nextLine();
	    	        if (str.matches("[0-9]+")) {
	    	            System.out.println("String has only digits.");
	    	        } else {
	    	            System.out.println("String does not have only digits.");
	    	        }

	    	        sc.close();
	    	    }
	    	}

