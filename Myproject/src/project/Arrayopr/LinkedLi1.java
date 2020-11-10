package project.Arrayopr;
//question 6.2
//Question 6.4
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedLi1 {
	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> Li1 = new LinkedList<Integer>();
		sc = new Scanner(System.in);
		System.out.println("Enter the elements:");
		for (int i = 0; i < 7; i++) {
			int num = sc.nextInt();
			Li1.add(num);
			}
		System.out.println("Elements in an array: "+Li1);
		int integer = Li1.get(4);
		System.out.println("Element in the 4th index is:"+integer);

}
}
