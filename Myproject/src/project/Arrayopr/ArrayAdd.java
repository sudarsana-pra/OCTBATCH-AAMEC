package project.Arrayopr;
//question 8.1 add the value 50 in the 2nd index and 
//display the list after adding
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayAdd {

	private static Scanner sc;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arAdd = new ArrayList<Integer>();
		sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		for (int i = 0; i < 8; i++) {
			int nextInt = sc.nextInt();
			arAdd.add(nextInt);
			}
		System.out.println("Elements in an array are: "+arAdd);
		arAdd.add(2,50);
		System.out.println("Elements after addition: "+arAdd);
	}
		

}
