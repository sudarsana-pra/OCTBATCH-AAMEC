package project.Set;

import java.util.HashSet;
//4.1 create a new hashset with values and return common values
public class HashSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> Hs3 = new HashSet<Integer>();
		HashSet<Integer> HS3 = new HashSet<Integer>();
		Hs3.add(10);
		Hs3.add(20);
		Hs3.add(30);
		Hs3.add(90);
		Hs3.add(10);
		Hs3.add(10);
		Hs3.add(40);
		Hs3.add(50);
		
		HS3.add(30);
		HS3.add(40);
		HS3.add(50);
		HS3.add(60);
		HS3.add(80);
		System.out.println(Hs3);
		System.out.println(HS3);
		Hs3.retainAll(HS3);
		System.out.println(Hs3);
			
		}
		
}


