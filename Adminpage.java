package FAbLibrary;

import java.util.Scanner;

public class Adminpage {
	

	
	void adminpage() {
    	  
    	  Scanner sn = new Scanner(System.in);
			
			  System.out.println();
			  
			  System.out.println("*****Admin Page*****");
			  
			  System.out.println();
			  
		  System.out.println("1.Students Record");
			  
			  System.out.println("2.Book Records");
			  
			  System.out.println("3.Manage Books");
			  
			  System.out.println("4.Exit");
			  
			  System.out.println("Enter Your Option: ");
			  
			  int opt = sn.nextInt();
    	  	
			  StudentRecord objs = new StudentRecord();
			  BooksRecords obj = new BooksRecords();
     
      switch(opt) {
     
			case 1: objs.StudentDtl();
			
				break;
				
			case 2: obj.bookRec();
			   
			   break;
			
			
     
     }
		
    
   }

	
	}

	
	



