package project.Arrayopr;

import java.util.Scanner;

public class ArraySum {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int[] a = new int[5];
		
		int sum = 0;
		System.out.println("Enter the elements of an array");
		for (int i = 0; i < 5; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i <= 4; i++) {
			sum = sum + a[i];

		}
		System.out.println("Sum of an elements in an array is: " + sum);
	}

}
