package citi.Scan;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner refName = new Scanner(System.in);

String empName = refName.nextLine();
System.out.println("Emp Name: "+empName);


int empId= refName.nextInt();


boolean permanent=  refName.nextBoolean();
System.out.println("Status  : "+ permanent);

	}

}
