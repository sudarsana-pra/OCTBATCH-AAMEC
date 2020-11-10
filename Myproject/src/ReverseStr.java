import java.util.Scanner;

public class ReverseStr {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse: ");
		
		String sb1= sc.nextLine();
		System.out.println("The string before reverse is: "+sb1);
		
		StringBuffer sb= new StringBuffer(sb1);
		StringBuffer sb2= sb.reverse();
		System.out.println("The reversed string is: "+sb2);
		
	}
}
