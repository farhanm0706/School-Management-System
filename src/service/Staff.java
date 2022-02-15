package service;

import java.util.Scanner;

public class Staff  {
	Scanner sc=new Scanner(System.in);
	

	public void newStaff() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("------New Staff Registration------");
		System.out.println("Enter Name:");
		String nameStaff=sc.nextLine();
		System.out.println("Enter Phone Number:");
		long phone=sc.nextLong();
		System.out.println("Enter Highest Graduation:");
		 String graduation=sc.next();
		System.out.println("Enter the previous institute name that you were working: ");
		String lastWork=sc.nextLine();
		System.out.println("Welcome On board!!!");
		System.out.println("Staff Name"+" "+"Phone No"+" "+"Graduation"+" "+"Previous Work Place");
		System.out.println(nameStaff +"    "+phone+"     "+graduation+"   "+lastWork );
		Principal p=new Principal();
		p.homePrincipal();
	}
	
}
