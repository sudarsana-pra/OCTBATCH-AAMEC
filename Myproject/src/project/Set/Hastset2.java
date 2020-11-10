package project.Set;
//question3.3

import java.util.HashSet;

public class Hastset2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> Hs2 = new HashSet<Integer>();
		Hs2.add(10);
		Hs2.add(20);
		Hs2.add(30);
		Hs2.add(40);
		Hs2.add(50);
		Hs2.add(60);
		Hs2.add(70);
		Hs2.add(80);
		Hs2.add(90);
		Hs2.add(10);
		Hs2.add(20);
		System.out.println("Elments in a hashset are: "+Hs2);
		for (int y : Hs2) {
			System.out.println("Elements are: "+y);
			
		}

	}

}
