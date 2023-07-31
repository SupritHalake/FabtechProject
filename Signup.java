package FAbLibrary;

import java.util.Scanner;

public class Signup {

	 void signupdetails(Loginpage[] adminDatabase)
	{
		
		Scanner Sc = new Scanner(System.in);
		
		System.out.println(" 👤 Enter your user name:-");
		
		 String c = Sc.nextLine();
		
		System.out.println(" 🔑 Enter your password:-");
		
		String d = Sc.nextLine();
		
		System.out.println("!!!Your Account has been created succesfully!!!");
		
		Loginpage obj1=new Loginpage(c, d);
		
		adminDatabase[0]=obj1;
		
		
	}
	

}
