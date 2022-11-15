package LibraryMS;

public class Librarian extends Patron {

	int LibrarianId;
	double salary;
	int age;
	
	public Librarian(int LibrarianId) {
		this.LibrarianId = LibrarianId ;
	}
	
	public int getLibrarianId() {
		return LibrarianId;
	}
	public void setLibrarianId(int librarianId) {
		LibrarianId = librarianId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	    
	public  void showInfo() {
		
		System.out.println("Librarian Id   : "+getLibrarianId());
	    System.out.println("Librarian Name : "+getName());
	    System.out.println("Age            : "+getAge());
	    System.out.println("Email          : "+getEmail());
	    System.out.println("ContactNo      : "+getContactNo());
	    System.out.println("Address        : "+getAddress());
	    System.out.println("Salary         : "+getSalary());
		
	}
	
}
