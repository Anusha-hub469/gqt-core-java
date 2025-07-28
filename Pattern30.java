package patterns;

import java.util.Scanner;

public class Pattern30 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        int n1 = 5; // Total number of rows

                for (int i = 1; i <= n1; i++) {
                    // Print spaces before stars
                    for (int j = 1; j <= n1 - i; j++) {
                        System.out.print(" ");
                    }

                    // Print stars with a space after each
                    for (int k = 1; k <= i; k++) {
                        System.out.print("* ");
                    }

                    // Move to next line
                    System.out.println();
                }
            }
}
        

		

		



