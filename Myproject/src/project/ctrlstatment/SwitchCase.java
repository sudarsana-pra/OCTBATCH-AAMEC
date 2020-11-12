package project.ctrlstatment;

import java.util.Scanner;

public class SwitchCase {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1.Student's Name");
		System.out.println("2.Student's Reg. No.");
		System.out.println("3.Student's Dept.");
		System.out.println("4.Student's phoneNo.");
		System.out.println("Enter the option: ");
		sc = new Scanner(System.in);
		int option= sc.nextInt();
		switch (option) {
		case 1:
			System.out.println("Name of the student: RAMESH G");
			break;
		case 2:
			System.out.println("Reg. no. of the student: 820417105052");
			break;
		case 3:
			System.out.println("Deartmrnt of the student: EEE");
			break;
		case 4:
			System.out.println("Phone number of the student: 9876543210");
			break;
		default :
			System.out.println("EXIT");
			break;
		
	}

}
}
