package patterns;

import java.util.Scanner;

public class Pattern28 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of rows (e.g., 5):");
	        int n = sc.nextInt();

	        // Upper half
	        for (int i = 1; i <= n; i++) {
	            // Print leading spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            // Print first number
	            System.out.print(i);

	            // Print internal spaces
	            if (i != 1) {
	                for (int j = 1; j <= (2 * i - 3); j++) {
	                    System.out.print(" ");
	                }

	                // Print second number
	                System.out.print(i);
	            }

	            System.out.println();
	        }

	        // Lower half
	        for (int i = n - 1; i >= 1; i--) {
	            // Print leading spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            // Print first number
	            System.out.print(i);

	            // Print internal spaces
	            if (i != 1) {
	                for (int j = 1; j <= (2 * i - 3); j++) {
	                    System.out.print(" ");
	                }

	                // Print second number
	                System.out.print(i);
	            }

	            System.out.println();
	        }

	        sc.close();
	    }
	}