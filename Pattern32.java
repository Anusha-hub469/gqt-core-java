package patterns;

import java.util.Scanner;

public class Pattern32 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        for (int i = 0; i < 6; i++) {
            for (int j = 1; j <= 5 - i; j++) {
            	System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i + 1; k++) {
            	System.out.print((char)('A' + i));
            }
            System.out.println();
        }

		// TODO Auto-generated method stub

	}

}
