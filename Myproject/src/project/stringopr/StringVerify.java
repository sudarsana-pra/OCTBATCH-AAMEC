package project.stringopr;
//Get the address from the user and verify "pincode" is present or not?
import java.util.Scanner;

public class StringVerify {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Address: ");
			 String Address= sc.next();
			 
			 int pincode= Address.indexOf("610001");
			 
			if(pincode!=-1)
				System.out.println("Valid address");
			else
				System.out.println("invalid address");
			
		    }

		}

