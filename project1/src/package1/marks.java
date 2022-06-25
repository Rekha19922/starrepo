package package1;

import java.util.Scanner;

public class marks {
	public static void main(String[]args)
	{
		Scanner S= new Scanner(System.in);
		System.out.println("enter the marks");
		int marks=S.nextInt();
		if((marks>=0)&&(marks<35))
		{
			System.out.println("Fail");
			}
		else if((marks>=35)&&(marks<60))
		{
			System.out.println("Pass");
		}
		else if((marks>=60)&&(marks<80))
	{
			System.out.println("First Division");
		}
		else if((marks>=80)&&(marks<=100))
		{
			System.out.println("Merit");
		}
		else {
			System.out.println("Please enter correct marks");
		}
	}

}
