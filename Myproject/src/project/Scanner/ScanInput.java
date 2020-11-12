package project.Scanner;

import java.util.Scanner;

public class ScanInput {

	private static Scanner refName;

	public static void main(String[] args) {
		refName = new Scanner(System.in);
		String empName= refName.nextLine();
		System.out.println("Emp Name : " +empName);
		
		int empId= refName.nextInt();
		System.out.println("EmpId : " +empId);
		
		long phNo= refName.nextLong();
		System.out.println("Phone Number : " +phNo);
		
		boolean condition= refName.nextBoolean();
		System.out.println("status : " +condition);
		

	}

}
