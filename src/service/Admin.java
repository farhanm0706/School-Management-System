package service;

import java.util.Scanner;

import controller.Main;
import utility.AdminValidation;

public class Admin {
	public void homeAdmin() throws Exception
	{
		if(AdminValidation.validate())
		{	
			System.out.println("Login successfull");
			System.out.println();
			
		System.out.println("Admin Desk");
		System.out.println("1.New Principal Registration");
		System.out.println("2.Logout");
		Scanner sc=new Scanner(System.in);
		int sel=sc.nextInt();
		switch(sel)
		{
		case 1:
			Principal p=new Principal();
			p.newPrincipal();
		case 2:Main.main(null);
		}
		}
		else
		{
			System.out.println("Login UnSuccessfull");
			Main.main(null);
		}
	
	}
}
