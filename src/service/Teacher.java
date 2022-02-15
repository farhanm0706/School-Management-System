package service;

import java.util.Scanner;

import model.Student;

public class Teacher extends Student {
Scanner sc=new Scanner(System.in);
	
	
	public void newTeacher() throws Exception
	{
		System.out.println("------New Teacher Registration------");
		System.out.println("Enter Name:");
		String nameStaff=sc.nextLine();
		System.out.println("Enter Phone Number:");
		long phone=sc.nextLong();
		System.out.println("Enter Highest Graduation:");
		 String graduation=sc.next();
		 sc.nextLine();
		System.out.println("Enter the previous institute name that you were working: ");
		String lastWork=sc.nextLine();
		System.out.println("Welcome On board!!!");
		System.out.println("Staff Name"+" "+"Phone No"+"     "+"Graduation"+" "+"Previous Work Place");
		System.out.println(nameStaff +"    "+phone+"     "+graduation+"      "+lastWork );
		Principal p=new Principal();
		p.homePrincipal();
		
	
	}
	
	

	
}
