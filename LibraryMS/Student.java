package LibraryMS;

public class Student extends Patron {

	int studentId;
	String guardianName;
	String guardianContactNo;
	
	public Student(int studentId){
		this.studentId = studentId;
	}
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getGuardianName() {
		return guardianName;
	}
	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}
	public String getGuardianContactNo() {
		return guardianContactNo;
	}
	public void setGuardianContactNo(String guardianContactNo) {
		this.guardianContactNo = guardianContactNo;
	}
	
	public void showInfo()
	{
		System.out.println("StudentId         : "+getStudentId());
		System.out.println("Name              : "+getName());
		System.out.println("DepartmentName    : "+getDepartmentName());
		System.out.println("Email             : "+getEmail());
		System.out.println("ContactNo         : "+getContactNo());
		System.out.println("Address           : "+getAddress());
		System.out.println("Amount            : "+getAmount());
		System.out.println("GuardianName      : "+getGuardianName());
		System.out.println("GuardianContactNo : "+getGuardianContactNo());
		System.out.println("\n");
		
	}
	
	

}
