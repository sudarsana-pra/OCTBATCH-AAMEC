package citi.ctrlstat;

import java.util.Scanner;

public class cntrlStatement {
public static void main(String[] args) {
Scanner sc=  new Scanner(System.in);

System.out.println("Enter the Age : ");


int person = sc.nextInt();

if (person>=18) {
	System.out.println("elligible");
}else {
	System.out.println("not Elligible");
}
	
}
}
