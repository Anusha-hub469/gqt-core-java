package StringBuiltInMethods;

import java.util.Scanner;

public class replacevowels2{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		
		 String modifiedStr = str.replace("A", "$")
                              .replace("a", "$")
                              .replace("E", "#")
                              .replace("e", "#")
                              .replace("I", "*")
                              .replace("i", "*")
                              .replace("O", "@")
                              .replace("o", "@")
                              .replace("U", "&")
                              .replace("u", "&");

		System.out.println("Modified String:" + modifiedStr);
				}
				}
	