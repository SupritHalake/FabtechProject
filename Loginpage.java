package FAbLibrary;

import java.util.Scanner;

public class Loginpage
{
	String adminId ="c";
	String adminpass ="d";
	
	Scanner sc = new Scanner (System.in);

	
	
	public Loginpage(String adminId, String adminpass) {
	
		this.adminId = adminId;
		this.adminpass = adminpass;
	}
    
	public Loginpage() {
		
}

	public  void login(Loginpage[] adminDatabase ){
		
		System.out.println("**Login Page**");
		
		
		System.out.println("Enter Id -");
		String a=sc.nextLine();
		
		System.out.println("Enter Password -");
		String b=sc.nextLine();
		
		
		
		
		if (adminDatabase[0]==null) {
			System.out.println("!!! please signup first!!! ");
		
		    System.out.println();
		    
            Welcomepage welobj2 = new Welcomepage();
		 	
		    welobj2.display();
	}
		
		else if((adminDatabase[0].adminId.equals(a) && adminDatabase[0].adminpass.equals(b))) {
			
			System.out.println();
			
			System.out.println("Login Successful : Welcome Dear Admin");
			
			System.out.println();
			
		Adminpage adpage = new Adminpage();
			adpage.adminpage();
			}
		
		else {
			
			
			System.out.println("you have Entered Incorrect Id Or Password Login Unsuccessful");
			
			System.out.println();
			
		    System.out.println("Please Try Again!!");
		 		
		 	System.out.println();
		 	
		 	Welcomepage wlobj = new Welcomepage();
		 	
		    wlobj.display();
		}
		
		
		
	 }



}



