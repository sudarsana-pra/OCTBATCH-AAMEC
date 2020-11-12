package project.ctrlstatment;

import java.util.Scanner;

//Write Java program to allow the user to input his/her age.
//Then the program will show if the person is eligible to vote.
//A person who is eligible to vote must be older than or equal 1 to 18 years old.
public class VoteEligible{
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age= sc.nextInt();
		if(age>=18) {
			System.out.println("you are eligile for vote");
		}
		else {
			System.out.println("you are not eligible for vote");
		}
	}
}