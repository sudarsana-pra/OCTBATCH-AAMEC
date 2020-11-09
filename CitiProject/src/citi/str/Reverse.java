package citi.str;

import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the string to reverse :");
	String input = sc.nextLine(); // mani (0-3 index) (1-4 length)
	String rev="";
	//				a		   ;b	  ; d				
	for (int i = input.length()-1; i >=0; i--) {
	char c = input.charAt(i);
	rev = rev+c;
	System.out.println("reversed string:"+rev);
			//c
	}
	
}
}
