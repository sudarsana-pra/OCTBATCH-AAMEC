package project.Arrayopr;
//qus 5.1
import java.util.ArrayList;

public class ArrayLi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> Al1 = new ArrayList<Integer>();
		Al1.add(10);
		Al1.add(20);
		Al1.add(30);
		Al1.add(90);
		int indexOf = Al1.indexOf(10);
		System.out.println("Elements in an arralist are : "+Al1);
		System.out.println(" first Index of 10 is: "+indexOf);
		
//qus 5.2
		ArrayList<Integer> Al2 = new ArrayList<Integer>();
		Al2.add(10);
		Al2.add(20);
		Al2.add(30);
		Al2.add(90);
		Al2.add(10);
		Al2.add(10);
		Al2.add(40);
		Al2.add(50);
		int lastIndexOf = Al2.lastIndexOf(10);
		System.out.println("Elements in an arralist are : "+Al2);
		System.out.println("last Index of 10 is: "+lastIndexOf);
//qus 5.3
		int indexOf2 = Al2.indexOf(50);
		System.out.println("Index of 50 is :"+indexOf2);
//qus 5.4
		int indexOf3 = Al2.indexOf(90);
		System.out.println("Indexof 90 is :"+indexOf3);
		
		}

}
