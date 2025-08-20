package StringBuiltInMethods;

import java.util.Scanner;

public class ImmutableProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter String-1:");
		String str1=sc.next();
		System.out.println("enter String-2:");
		String str2=sc.next();
		
		str1 = str1.concat(str2);
		System.out.println(str1);
	}
}
		