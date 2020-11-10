package project.Arrayopr;


import java.util.LinkedHashSet;


public class ArraySet {
	

	public static void main(String args[]) {
		// Create an array list.
		LinkedHashSet<String> al = new LinkedHashSet<String>();
		System.out.println("Initial size of al: " +al.size());
		// Add elements to the array list.
		al.add("R");
		al.add("A");
		al.add("M");
		al.add("E");
		al.add("S");
		al.add("H");
		
		System.out.println("Size of al after additions: " +al.size());
		System.out.println("Contents of al: " + al);


		}
}


