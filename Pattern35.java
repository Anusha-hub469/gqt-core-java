package patterns;

import java.util.Scanner;

public class Pattern35 {

	public static void main(String[] args) {
		
		        int n1 = 5; // number of rows

		        for (int i = 0; i < n1; i++) {
		            
		            for (int j = 0; j < n1 - i - 1; j++) {
		                System.out.print(" ");
		            }

		            // Print descending characters
		            for (char ch = (char) ('A' + i); ch >= 'A'; ch--) {
		                System.out.print(ch);
		            }

		            // Print ascending characters starting from 'B'
		            for (char ch = 'B'; ch <= (char) ('A' + i); ch++) {
		                System.out.print(ch);
		            }

		            System.out.println();
		        }
		    }
		}
