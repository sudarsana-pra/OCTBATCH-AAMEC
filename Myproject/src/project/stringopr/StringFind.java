package project.stringopr;
//Get the email id from the user and verify '@' is present or not?

import java.util.Scanner;

public class StringFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mailid: ");
		String mail = sc.next();
		char input=mail.charAt(mail.indexOf("@"));
		char i1='@';
		if(input==i1)
			System.out.println("Valid mailid");
		else
			System.out.println("invalid mailid");
		
	    }

	}
