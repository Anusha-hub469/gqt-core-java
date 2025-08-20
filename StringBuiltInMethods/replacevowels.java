package StringBuiltInMethods;

import java.util.Scanner;

public class replacevowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		char SpecialChar='#';
		String result="";
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
				if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U' || str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
					result += SpecialChar;
				}
				else {
					result+=ch;
				}
				}
		System.out.println("Modified String:"+result);
				}
				}
	