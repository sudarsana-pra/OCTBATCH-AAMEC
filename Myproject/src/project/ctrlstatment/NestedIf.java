package project.ctrlstatment;

import java.util.Scanner;

public class NestedIf {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int number= sc.nextInt();
		if(number>=0) {
			System.out.println("Given input is positive "+number);
		}
		  if(number==0) {
			  System.out.println("Given number is zero "+number);
		  }
		  else {
			  System.out.println("Given number is negative "+number);
		  }
	}

}
