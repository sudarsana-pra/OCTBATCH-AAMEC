package project.stringopr;
//Get two input from user and check the equality 
//print in the output whether it is Equal or not
import java.util.Scanner;

public class StringEquals {
	private static Scanner sc;

	//question4
	 public static void main(String[] args) {
		    sc = new Scanner(System.in);
			System.out.println("\nEnter first string");
			String s6= sc.nextLine();
			
			System.out.println("Enter second string");
			String s7= sc.nextLine();
			boolean a3 = s6.equalsIgnoreCase(s7);
			System.out.println(s6+"="+s7+ " returns: "+a3);
	 }

}
