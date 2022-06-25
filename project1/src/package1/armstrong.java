package package1;

import java.util.Scanner;

public class armstrong {
	public static void main(String[]args) {
		Scanner S=new Scanner (System.in);
		System.out.println("Enter any number");
	int num = S.nextInt();
	int l = 0;
	int a1=num;
	while(a1!=0) {
	l=l+1;
	a1=a1/10;
	}
	
	int a2=num;int rem;
	int arm=0;
	while(a2!=0) {
		rem =a2%10;
		int mul=1;
		for(int i=1;i<=l;i++)
        {
			mul=mul*rem;
		}
	arm=arm+mul;
	a2=a2/10;
	}
	if(arm==num)
	
	{
		System.out.println(num+  "number is armstrong");
	}
	else
	{
		System.out.println(num+    "number is not armstrong");
	}
	
	}
}
