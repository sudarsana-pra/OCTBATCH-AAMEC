package project.Arrayopr;
//Question 5.5
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayLi2 {

	private static Scanner sc;

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		LinkedList<Integer> Li2 = new LinkedList<Integer>();
		sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		for (int i = 0; i < 10; i++) {
			int nextInt = sc.nextInt();
			Li2.add(nextInt);
			System.out.println("Elements in an array: "+Li2);
			
			System.out.println("Last index of 10: "+Li2.lastIndexOf(70));
			}

	}

}
