

public class class2 {
	public int sum(int a , int b)
	{
		int c;
		c= a+b;
		System.out.println("Sum reasult is"+c);
		return c;
	}
	public int sub(int x1, int x2)  { 
		int x;
		x=x1-x2;
		System.out.println("subtract reasult is "+x);
		return x;
}
		public void  multi(int c,int x) {
			int y;
			y= c*x;
			System.out.println("final reasut is "+y);
		}
		public static void main(String[]args) {
			class2 ob=new class2();
			int sumresult =ob.sum(10, 2);
			int subresult =ob.sub(15,6);
			ob.multi(sumresult,subresult);
		}

	}