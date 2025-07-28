package patterns;

import java.util.Scanner;

public class Pattern24 {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the number of rows:");
		        int n = sc.nextInt();  
		        
		        for (int i = 1; i <= n; i++) {
		            
		            for (int j = 1; j <= n - i; j++) {
		                System.out.print(" ");
		            }

		            // Print numbers (2*i - 1 times)
		            for (int k = 1; k <= 2 * i - 1; k++) {
		                System.out.print(i);
		            }

		            System.out.println();  // Move to next row
		        }

		        sc.close();
		    }
		}
