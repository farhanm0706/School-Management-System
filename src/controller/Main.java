package controller;

import java.util.Scanner;

import service.Admin;
import service.Principal;
import service.Staff;
import service.Teacher;

public class Main  {
	public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		
			System.out.println("----------School Management System---------");
			int select;
		do {
		System.out.println("Select the Category you belongs to:");
		System.out.println("1.Admin"+ "\n"+"2.Principal");
		
		select=sc.nextInt();
	    
		switch(select)
	    {

	    case 1:
		Admin a=new Admin();
		a.homeAdmin();
		break;
	    case 2:
		Principal p=new Principal();
		p.homePrincipal();
		break;
	
	    default:
		System.out.println("please enter proper category you belongs");
		
	    }
		}
		while(select!=1 && select!=2);
		
			
		
	}
}
