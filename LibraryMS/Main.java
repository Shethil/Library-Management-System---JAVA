package LibraryMS;
import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
		
	
 
			
		 System.out.print("What Do you waant to see?\r\n\n"+ 
   		"1 >>:Library Details   \n" + 
   		"2 >>:Librarian Details \n" + 
   		"3 >>:Teacher Details   \n" + 
   		"4 >>:Student Details   \n" + 
   		"5 >>:Book Details      \n\n" + 
   		"Enter your choice : " );
		 
		 int choice;
         Scanner sc = new Scanner(System.in);
         choice= sc.nextInt();
         
         switch (choice) {
         
         case 1 :{
        	 LibraryDetails();
       	  break;
         }
         
         case 2 :{
        	 LibrarianDetails();
       	  break;
         }
         
         case 3 :{
        	 TeacherDetails();
       	  break;
         }
         
         case 4 :{
        	 StudentDetails();
       	  break;
         }
         
         case 5 :{
        	 BookDetails();
       	  break;
         }
         
             
       default :{
        	 System.out.println("\nWrong Input . Try Again\n");
         }
        	 
               
         }  
	}




public static void LibraryDetails() {
		System.out.println("\n*************** Library Details ***************\n");	
		
		
	}
	
public static void StudentDetails() {
	
	System.out.println("\n*************** Student Details ***************\n");
	
	
      
	} 
			
public static void TeacherDetails() {
	System.out.println("\n*************** Teacher Details ***************\n");
	
	
    
}

public static void LibrarianDetails() {
	System.out.println("\n*************** Librarian Details ***************\n");
	
	
     
}

public static void BookDetails() {
	System.out.println("\n*************** Book Details ***************\n");
	
	
     
} 

}

	

	

