package project.ctrlstatment;

import java.util.Scanner;

public class DecStatment {
	
	private static Scanner scObj;

	public static void main(String[] args) {
		scObj = new Scanner(System.in);
		
		System.out.println("enter the amount of the purchased item");
		double disPercent;
		double totalAmount;
		int purchaseAmount= scObj.nextInt();
		
		if (purchaseAmount>=1000) {
			disPercent=10;
		    totalAmount= purchaseAmount-(purchaseAmount*(disPercent/100));
			}
		else {
			disPercent=0;
			totalAmount= purchaseAmount;
		}
		System.out.println("payable amount:" +totalAmount);
		}
	}
 