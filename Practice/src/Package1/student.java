package Package1;
public class student{
	int roll,age;
	void display1() {
		System.out.println("Roll number of the present students");
		}
	void display2() {
		System.out.println("Age of the present students");
	}
	public static void main(String[]args) {
		
		System.out.println("Rekha");
		student xyz=new student();
		xyz.display1();
		xyz.roll=2;
		System.out.println(xyz.roll);
		xyz.display2(); 
		xyz.age=30;
		System.out.println(xyz.age);
	}
	
}
	