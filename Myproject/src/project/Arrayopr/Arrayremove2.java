package project.Arrayopr;

import java.util.ArrayList;

public class Arrayremove2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> Alr2 = new ArrayList<Integer>();
		Alr2.add(10);
		Alr2.add(20);
		Alr2.add(30);
		Alr2.add(90);
		Alr2.add(10);
		Alr2.add(10);
		Alr2.add(40);
		System.out.println("element are: "+Alr2);
		int lastIndexOf = Alr2.lastIndexOf(10);
		System.out.println("Last index of 10 is :"+lastIndexOf);
		Alr2.remove(lastIndexOf);
		System.out.println("Array after removing :"+Alr2);

	}

}
