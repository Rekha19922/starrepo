package package1;

import java.util.Scanner;

public class primenumber1 {
	public static void main(String[]args) {
 
	int num, temp=0;
	    System.out.println("Enter any no.");
		Scanner s = new Scanner(System.in);
        num=s.nextInt(); 
for(int i=2;i<=num-1;i++)
{
			if(num%i==0)
			{
				temp=temp+1;
			}
}
				if(temp>0)
				{
			 System.out.println("Number is not prime");
		}
		else
		{
			System.out.println("Number is prime");
		}
	}

	}

