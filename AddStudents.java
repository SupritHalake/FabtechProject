package FAbLibrary;

import java.util.Scanner;

public class AddStudents {
	 void Sdetails(){
			
			
			
		 Scanner sc = new Scanner(System.in);
		
		 System.out.println("Enter How Many Students You Want To Add!!");
			
		 int totalstudents = sc.nextInt();
		
		 String []stdname = new String [totalstudents];
		
		 String []stdroll   = new String [totalstudents];
		
		 System.out.println("Enter Students Name And Roll Number");
		
		 System.out.println();
		
		 for(int i=0 ;i<totalstudents ;i++) {
			
	     System.out.println("Enter Student Name- ");
			
	     stdname[i] =sc.next();
			 
	     System.out.println("Enter Roll Name- ");
			 
	     stdroll[i] = sc.next();
	    
		 }
		
		  System.out.println();
	      System.out.println("!!!Data Added Successfully!!!");
	      
	      Adminpage obj = new Adminpage();
	      
	      obj. adminpage();
	      
	      
	   
	      int i = 0;
	      System.out.println("!!!Display Student Page!!!");
	      
	      System.out.println(); 
	      
	      System.out.println("***Added Students And Their Roll Number***");
	      
	      System.out.println();
	      
	      for(i=0;i<totalstudents;i++) {
	    	  
		  System.out.println ("Name:" +stdname[i]);
		  
		  System.out.println("Roll no:" +stdroll[i]);
		  
		  System.out.println();
		  
		  
		
		}
	  }

}
