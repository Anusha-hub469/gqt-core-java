package patterns;

import java.util.Scanner;

public class Pattern31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
		int n1 = 5;
		for (int i = 1; i <= n1; i++) {
		    for (int j = 1; j <= n1 - i; j++) {
		    	System.out.print(" ");
		    }
		    for (int k = 1; k <= (2 * i - 1); k++) {
		    	System.out.print("*");
		    }
		    System.out.println();

		// TODO Auto-generated method stub

	}
	}
}
