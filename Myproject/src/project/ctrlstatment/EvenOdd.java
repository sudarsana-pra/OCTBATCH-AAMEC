package project.ctrlstatment;
//Write a program to find even or odd number

import java.util.Scanner;

public class EvenOdd {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num= sc.nextInt();
		if(num%2==0) {
			System.out.println("It's an even number");
		}
		else {
			System.out.println("It's an odd number");
		}

	}

}
