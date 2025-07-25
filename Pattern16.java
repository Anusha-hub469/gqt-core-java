package patterns;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the count:");
		int n=sc.nextInt();
		int count;
		for(int i=1;i<=n;i++) {
			count=i;
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			    count=count+n;
			    count++;
			}
			System.out.println();
		// TODO Auto-generated method stub
		}
	}

}