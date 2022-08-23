import java.util.Scanner;

public class Student implements IDisplay, IInput{
	String studentId;
	String name;
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student ID");
		this.studentId = sc.next();
		
		System.out.println("Enter the Name");
		this.name = sc.next();
		
	}
	
	@Override
	public void print() {
		System.out.println("Student ID " + studentId + " Name" + name);
		
	}
	
	@Override
	public void printDetails() {
		System.out.println("Student ID " + studentId);
		System.out.println("Name " + name);
				
	}
}
