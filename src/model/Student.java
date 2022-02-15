package model;

import java.util.Scanner;

import service.Principal;

public class Student {
	Scanner sc=new Scanner(System.in);


	public void newStudent() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Enter Student Id");
		String id=sc.next();
		sc.nextLine();
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		
		System.out.println("Enter the class to be admitted:");
		int std=sc.nextInt();
		System.out.println("Enter the Father name:");
		String father=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter the Fees to be paid");
		double fee=sc.nextDouble();
		System.out.println("Student Id" +" "+"Name"+"      "+"Class"+" "+"Father Name"+" "+"Fees");
		System.out.println(id+"  "+name +"   "+std+"  "+sc.nextLine() +father +" "+fee);
		Principal p=new Principal();
		p.homePrincipal();
	}



	
	

}
