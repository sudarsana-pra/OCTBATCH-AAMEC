package project.ctrlstatment;
//Write a program to find the factorial of a number.

import java.util.Scanner;

public class Factorial {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter a number to get factorial: ");
		int n= sc.nextInt();
		int fact=1;
		for (int i = 1; i <= n; i++) {
			fact =fact*i;
			}
		System.out.println("\nfactorial of "+n+" is: "+fact);

	}

}
