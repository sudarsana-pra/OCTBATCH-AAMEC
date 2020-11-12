package project.stringopr;
//Get the email from the user and verify '@' is present or not and return true or false?
import java.util.Scanner;

public class StringFind1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mailid: ");
		String mail = sc.next();
		boolean contains = mail.contains("@");
		System.out.println(contains);

	}

}
