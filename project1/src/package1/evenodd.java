package package1;

import java.util.Scanner;

public class evenodd {
	public static void main(String[]args) {
		Scanner S=new Scanner(System.in);
		System.out.println("Enter any number");
		int a=S.nextInt();
		if(a%2==0) {
			System.out.println("Even number  " +a);
		}
		else {
			System.out.println("Odd number  "  +a);
		}
	
}

}
