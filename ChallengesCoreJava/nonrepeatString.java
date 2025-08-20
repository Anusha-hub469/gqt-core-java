package ChallengesCoreJava;
import java.util.Scanner;
public class nonrepeatString {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
	                System.out.println("First non-repeated character: " + ch);
	                sc.close();
	                return;
	            }
	        }
	        System.out.println("No non-repeated character found.");
	        sc.close();
	    }
	}
