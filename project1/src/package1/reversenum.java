package package1;

import java.util.Scanner;

public class reversenum {
	public static void main(String[]args) {
		Scanner S= new Scanner(System.in);
		System.out.println("Enter any number");
		int num=S.nextInt();
		int rem;
		int rev=0;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("number is reverse of given number"  +rev);

		}
	}


