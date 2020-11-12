package project.Arrayopr;
import java.util.ArrayList;
import java.util.List;

public class Arrlist {

		public static void main(String args[]) {
		// Create an array list.
		List<String> al = new ArrayList<String>();
		System.out.println("Initial size of al: " +al.size());
		// Add elements to the array list.
		al.add("R");
		al.add("M");
		al.add("E");
		al.add("S");
		al.add("H");
		al.add(".G");
		al.add(1, "A");
		System.out.println("Size of al after additions: " +al.size());
		// Display the array list.
		System.out.println("Contents of al: " + al);
		System.out.println("Content to be removed: "+al.remove(6));
		System.out.println("Content of arraylist after removal is: "+al);
		System.out.println("Index of an element S is: "+al.indexOf("S"));
		}
}