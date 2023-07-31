package FAbLibrary;

import java.util.Scanner;

public class StudentRecord {
	
public static void main(String[] args) {
		
		
	}
		
	void StudentDtl() { 
		
		 Scanner sn = new Scanner(System.in);
   	  
   	     System.out.println();
   	  
         System.out.println("*****Student Page*****");
         
         System.out.println();
         
         System.out.println("1.Add Students ");
         
         System.out.println("2.Display All Student");
         
         System.out.println("3.Exit");
         
         System.out.println("Enter Your Option: ");
         
         int f = sn.nextInt();
         
         AddStudents obj =new AddStudents();
         BooksRecords obj4 = new BooksRecords();
         Adminpage obj5 = new Adminpage();
	switch(f) {
	
	case 1: obj.Sdetails();
	adminpage();
	break;
	
	
	}
  }

	private void adminpage() {
		// TODO Auto-generated method stub
		
	}

	private void bookRec() {
		// TODO Auto-generated method stub
		
	}

	}


