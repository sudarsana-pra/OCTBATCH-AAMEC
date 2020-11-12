package project.Set;

import java.util.LinkedHashSet;
import java.util.Scanner;
//Create a userdefine Set and insert the 10 employee details.
public class LinkedHash3 {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> Lhs3 = new LinkedHashSet<String>();
		sc = new Scanner(System.in);
		System.out.println("Enter the details");
		String EmpID = sc.nextLine();
		String EmpName = sc.nextLine();
		String PhoneNum = sc.nextLine();
		String Address = sc.nextLine();
		String DOB = sc.nextLine();
		String DOJ = sc.nextLine();
		String Email = sc.nextLine();
		String Gender = sc.nextLine();
		String Salary = sc.nextLine();
		Lhs3.add(EmpID);
		Lhs3.add(EmpName);
		Lhs3.add(PhoneNum);
		Lhs3.add(Address);
		Lhs3.add(DOB);
		Lhs3.add(DOJ);
		Lhs3.add(Email);
		Lhs3.add(Gender);
		Lhs3.add(Salary);
		System.out.println("ElementsinLinkedHashset: "+Lhs3);
		
		
		
        			

	}

}
