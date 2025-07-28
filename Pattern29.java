package patterns;

import java.util.Scanner;

public class Pattern29 {
	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the number of rows:");
	        int n = sc.nextInt();
	        int n1 = 5;

	        for (int i = n1; i >= 1; i--) {
	     
	            for (int space = 0; space < n1 - i; space++) {
	                System.out.print(" ");
	            }
	            
	            for (int j = 0; j < 2 * i - 1; j++) {
	                System.out.print(i);
	            }
	            System.out.println();
	        }
	       
	        for (int i = 2; i <= n1; i++) {
	           
	            for (int space = 0; space < n1 - i; space++) {
	                System.out.print(" ");
	            }
	            
	            for (int j = 0; j < 2 * i - 1; j++) {
	                System.out.print(i);
	            }
	            System.out.println();
	        }
	    }
}
	
