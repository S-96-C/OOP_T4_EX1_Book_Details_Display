public class Main {

	public static void main(String[] args) {
		
		//Create Objects of the Book
		Book b = new Book();
		
		//Create Object of the Student
		Student s = new Student();
		
		//Create Variable from IDisplay
		IDisplay ref1 ;
		
		//Create Variable from IInput
		IInput ref2;
		
		ref1 = new Book();
		ref1.printDetails();
		
		ref2 = new Student();
		ref2.input();
		
		b.input();
		b.print();
		b.printDetails();
		
		s.input();
		s.print();
		s.printDetails();
	}

}
