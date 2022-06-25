package package1;

import java.util.Scanner;

public class factorialbyd {
	public static void main(String[]args) {
	Scanner S= new Scanner(System.in);
	System.out.println("Enter any number");
	int num=S.nextInt();
	int f=1;
	for(int i=num;i>=1;i--)
	{
		f=f*i;
		
	}
	System.out.println("Factorial of the number is " +f);
}


}
