package patterns;

import java.util.Scanner;

public class Pattern33 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
		int n1 = 5; 

		        for (int i = 1; i <= n1; i++) {
		            for (int j = 1; j <= n1 - i; j++) {
		                System.out.print(" ");
		            }

		            // Calculate starting character: A + 2 * (i - 1)
		            char ch = (char) ('A' + 2 * (i - 1));

		            for (char c = ch; c >= 'A'; c--) {
		                System.out.print(c);
		            }

		            
		            System.out.println();
		        }
		    }
		}

