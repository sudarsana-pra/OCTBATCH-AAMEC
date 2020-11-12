package project.Set;
//5.3 create a treeset with elements and use removeall

import java.util.TreeSet;

public class TreeSet4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> Ts4 = new TreeSet<Integer>();
		TreeSet<Integer> TS4 = new TreeSet<Integer>();
		Ts4.add(10);
		Ts4.add(20);
		Ts4.add(30);
		Ts4.add(90);
		Ts4.add(10);
		Ts4.add(10);
		Ts4.add(40);
		Ts4.add(50);
		
		TS4.add(30);
		TS4.add(40);
		TS4.add(50);
		TS4.add(60);
		TS4.add(80);
		
		System.out.println(" in Array1: "+Ts4);
		System.out.println(" in Array2: "+TS4);
		boolean addAll = TS4.addAll(Ts4);
		System.out.println("Treeset addall: "+addAll);
		System.out.println("Element in Treeset addall: "+TS4);

		TS4.removeAll(Ts4);
		System.out.println("Element in Treeset removeall: "+TS4);



	}

}
