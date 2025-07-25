package patterns;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++){
				System.out.print(i+"  ");
			}
			System.out.println();
		// TODO Auto-generated method stub
		}
	}

}