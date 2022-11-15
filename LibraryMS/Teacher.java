package LibraryMS;

public class Teacher extends Patron {

	String teacherId;
      
	public Teacher(String teacherId) {
		this.teacherId = teacherId;
	}
	
	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	} 
	
	public void showInfo()
	{
		    
		System.out.println("Teacher Id      : "+getTeacherId());
	    System.out.println("Name            : "+getName());
	    System.out.println("Department Name : "+getDepartmentName());
	    System.out.println("Email           : "+getEmail());
	    System.out.println("Contact No      : "+getContactNo());
	    System.out.println("Address         : "+getAddress());
		System.out.println("Amount          : "+getAmount());
		System.out.println("\n");
	}
	
}
