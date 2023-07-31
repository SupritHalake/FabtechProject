
		
	package FAbLibrary;

import java.util.Scanner;


public class Welcomepage {
	
	Scanner sc = new Scanner(System.in);
	
	
Loginpage obj1 = new Loginpage();
	
	
	Loginpage[] adminDatabase=new Loginpage[1];
	Signup sgn = new Signup();
	
	
		
	
	

	
	public  void display() {
		
	
        System.out.println("************!!Fabtech Library Mangement Application!!************");
		
		System.out.println("1.login");

		System.out.println("2.Sign up");

		System.out.println("3.Exit");

		System.out.println("Enter Your Option: ");
		
		int a=sc.nextInt();
		
		Loginpage obj1 = new Loginpage();
	
		
		
		
		switch(a) {
		
		case 1:obj1.login(adminDatabase);
		display();
		break;
		   
	
		case 2:sgn.signupdetails(adminDatabase);
		display();
		break;
		
		case 3:
		
		break;
		
		case 4:
		 
		
		}

		
	}
		
	}
	
