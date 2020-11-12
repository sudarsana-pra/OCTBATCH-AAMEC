package project.Set;
//question 2
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ListToSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> Li1 = new ArrayList<Integer>();
		HashSet<Integer> Hs1 = new HashSet<Integer>();
		LinkedHashSet<Integer> Lhs2 = new LinkedHashSet<Integer>();
		TreeSet<Integer> Ts2 = new TreeSet<Integer>();
		Li1.add(105);
		Li1.add(205);
		Li1.add(305);
		Li1.add(805);
		Li1.add(705);
		Li1.add(605);
		Li1.add(505);
		Li1.add(405);
		Li1.add(505);
		Li1.add(605);
		System.out.println(" in Arraylist: "+Li1);
		boolean addAll = Hs1.addAll(Li1);
		boolean addAll2 = Lhs2.addAll(Li1);
		boolean addAll3 = Ts2.addAll(Li1);
		System.out.println("Hashset: "+addAll);
		System.out.println("Element in Hashset: "+Hs1);
		System.out.println("LinkedHashSet:"+addAll2);
		System.out.println("Elements in LinkedHashset: "+Lhs2);
		System.out.println("Treeset: "+addAll3);
		System.out.println("Elemnets in Treeset: "+Ts2);
		}

}
