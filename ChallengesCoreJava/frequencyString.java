package ChallengesCoreJava;
import java.util.Scanner;
public class frequencyString {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();
	        str = str.toLowerCase();       
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (str.indexOf(ch) == i && ch != ' ') {
	                int count = 1;
	                for (int j = i + 1; j < str.length(); j++) {
	                    if (ch == str.charAt(j)) {
	                        count++;
	                    }
	                }
	                System.out.println("Character '" + ch + "' occurs " + count + " times.");
	            }
	        }
	    }
	}
