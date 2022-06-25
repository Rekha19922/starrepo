package package1;

import java.util.Scanner;

public class palindrome {
	public static void main(String[]args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=S.nextInt();
		int temp=num;
		int rem;
		int rev=0;
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(num==rev) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("number is not palindrome");

		}
	}

}
