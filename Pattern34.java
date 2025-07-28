package patterns;

import java.util.Scanner;

public class Pattern34 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
		        int n1 = 5; 
		        for (int i = 0; i < n1; i++) {
		           
		            for (int j = 1; j <= n1 - i - 1; j++) {
		                System.out.print(" ");
		            }

		            
		            for (int k = i; k >= 1; k--) {
		                System.out.print(k);
		            }

		           
		            System.out.print("0");

		            
		            for (int k = 1; k <= i; k++) {
						System.out.print(k);
		            }

		           
		            System.out.println();
		        }
		    }
		}
