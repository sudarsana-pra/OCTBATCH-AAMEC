package project.Arrayopr;
//question 6.5
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLi3 {
	private static Scanner sc;

	public static void main(String[] args) {
		ArrayList<Integer> Al3 = new ArrayList<Integer>();
		sc = new Scanner(System.in);
		System.out.println("Enter an elements:");
		int n=4;
		for (int i = 0; i < n; i++) {
			int nextInt = sc.nextInt();
			Al3.add(nextInt);
		}
		System.out.println("Elements: "+Al3);
		}
	}


