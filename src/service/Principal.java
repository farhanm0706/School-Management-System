package service;

import java.util.ArrayList;
import java.util.Scanner;

import controller.Main;
import model.Student;
import utility.PrincipalValidation;

public class Principal {
	Scanner sc=new Scanner(System.in);

	
	public void homePrincipal() throws Exception
	{
		int select;
		if(PrincipalValidation.validate())
		{
			System.out.println("Login successfull");
			System.out.println();
			do {
		System.out.println("------Principal Control Desk------");
		System.out.println("1.Add Teacher");
		System.out.println("2.Add Student");
		System.out.println("3.Add Staff");
		select=sc.nextInt();
		switch(select)
		{
		case 1: Teacher t=new Teacher();
				t.newTeacher();
				break;
		case 2: Student st=new Student();
				st.newStudent();
				break;
		case 3: Staff s=new Staff();
				s.newStaff();
				break;
		default: System.out.println("Invalid input");
		}
			}
		while(select!=1 && select!=2 && select!=3);
		
		
		}
		else
		
			{
				System.out.println("Login UnSuccessfull");
				Main.main(null);
			}
		
		
		
	}
	
		
	
	public void newPrincipal() throws Exception
	{
		ArrayList<Object> al=new ArrayList<Object>();
		System.out.println("------New Principal Registration------");
		System.out.println("Enter Name:");
		String name=sc.nextLine();
	    al.add(name);
	
		System.out.println("Enter Phone Number:");
		long phone=sc.nextLong();
		al.add(phone);
		System.out.println("Enter Highest Graduation:");
		String graduation=sc.next();
		al.add(graduation);
		sc.nextLine();
		System.out.println("Enter the previous institute name that you were working: ");
		String lastWork=sc.nextLine();
		al.add(lastWork);
		System.out.println("Welcome On board!!!");
		System.out.println(al);
		
		System.out.println("Press 1 to go back to Home page");
		int select=sc.nextInt();
		switch(select)
		{
		case 1:Main.main(null);
		default:System.out.println("Invalid Input");
		         
		}
		
		
	}


}
