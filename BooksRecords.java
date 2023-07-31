package FAbLibrary;

import java.util.Scanner;

public class BooksRecords {
	
	void bookRec() {
		
		Scanner Sc = new Scanner (System.in);
		
		System.out.println("**** Book Record Page ****");
		
		System.out.println("1.Add Books");
	     
		System.out.println("2.Show Books");
		
		System.out.println("3.Exit");
		
		System.out.println("Enter Your Option");
		
		int k = Sc.nextInt();
		
		 BooksRecords objn = new BooksRecords();
		
		switch(k) {
		
		case 1:objn.addbooks();
		
		   
		       
		       
		case 2:
		
		       break;
		}
		
		
		
	}
		
		void addbooks() {
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println("How Many Books You Want To Add");
		
		int Add= Sc.nextInt();  
		
		String []bookname = new String[Add];
		
		String []Authorname = new String [Add];
		
		for(int i=0;i<Add;i++) {
			
			
	    System.out.println("Enter Book Name:" );
			
		bookname[i] = Sc.next();
			
			
	    System.out.println("Enter Author Name:" );
			
		Authorname[i] = Sc.next();
		     
		}
			
		System.out.println("!!!!Books Are Added Successfully!!!!");
			
		System.out.println();
			
		bookRec();
			
		
	    int i = 0;
			   
		      System.out.println("!!!Display Books Page!!!");
		      
		      System.out.println(); 
		      
		      System.out.println("***Added Books And Their Author Name ***");
		      
		      System.out.println();
		      
		      for(i=0;i<Add;i++) {
		    	  
			  System.out.println ("Book Name: " +bookname[i]);
			  
			  System.out.println("Author Name: " +Authorname[i]);
			  
			  System.out.println();
			
			
			}
		
		}
		

}
