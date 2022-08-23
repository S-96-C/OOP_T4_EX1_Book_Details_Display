import java.util.Scanner;

public class Book implements IDisplay,IInput {
	
	int bookId;
	String title;
	String publisher;
	@Override
	public void input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Book ID");
		this.bookId = sc.nextInt();
		
		System.out.println("Enter the Book Title");
		this.title = sc.next();
		
		System.out.println("Enter the Publisher");
		this.publisher = sc.next();
	}
	@Override
	public void print() {
		
		System.out.println("Book ID " + this.bookId +
						 "Book Title " + this.title +
						 "Publisher " + this.publisher);
		
	}
	@Override
	public void printDetails() {
		
		System.out.println("Book ID " + this.bookId);
		System.out.println("Book Title " + this.title);
		System.out.println("Publisher " + this.publisher);
	}
	
}
