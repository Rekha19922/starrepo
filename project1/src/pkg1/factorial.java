package pkg1;

import java.util.Scanner;

public class factorial {
	public static void main(String[]args) {
		Scanner S= new Scanner(System.in);
		System.out.println("Enter any number");
		int num=S.nextInt();
		int f=1;
		for(int i=1;i<=num;i++) {
			f=f*i;
			
		}
		System.out.println("Factorial of the number is " +f);
	}

}
