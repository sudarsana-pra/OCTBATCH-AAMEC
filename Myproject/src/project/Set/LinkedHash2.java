package project.Set;

import java.util.LinkedHashSet;

//5.2 create a linkedhashset and perform remove all
public class LinkedHash2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> LHs4 = new LinkedHashSet<Integer>();
		LinkedHashSet<Integer> LHS4 = new LinkedHashSet<Integer>();
		LHs4.add(10);
		LHs4.add(20);
		LHs4.add(30);
		LHs4.add(90);
		LHs4.add(10);
		LHs4.add(10);
		LHs4.add(40);
		LHs4.add(50);
		
		LHS4.add(10);
		LHS4.add(20);
		LHS4.add(60);
		LHS4.add(50);
		LHS4.add(40);
		LHS4.add(70);
		LHS4.add(80);
		LHS4.add(90);
		
		System.out.println(" in Array1: "+LHs4);
		System.out.println(" in Array2: "+LHS4);
		boolean addAll = LHS4.addAll(LHs4);
		System.out.println("LinkedHashset addall: "+addAll);
		System.out.println("Element in LinkedHashset addall: "+LHS4);

		LHS4.removeAll(LHs4);
		System.out.println("Element in LinkedHashset removeall: "+LHS4);



	}

}
