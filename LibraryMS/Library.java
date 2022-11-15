package LibraryMS;

public class Library {

	String libraryName;
	String address;
	int noOfBooks;
	int totalCopyOfBooks  ;
	int numOfMember  ;
	int numOfStuff ;
	
	public void LibraryDetails() {
		System.out.println("LibraryName         : "+libraryName);
		System.out.println("Address             : "+address);
		System.out.println("Total Member        : "+numOfMember);
		System.out.println("Total Stuff         : "+numOfStuff);
		System.out.println("Number of books     : "+noOfBooks);
		System.out.println("Total Copy 0f books : "+totalCopyOfBooks);
		
	}

}
