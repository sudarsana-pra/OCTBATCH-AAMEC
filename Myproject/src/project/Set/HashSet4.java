package project.Set;
//5.1 create a new hashset and perform removeall()
import java.util.HashSet;

public class HashSet4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> Hs4 = new HashSet<Integer>();
		HashSet<Integer> HS4 = new HashSet<Integer>();
		Hs4.add(10);
		Hs4.add(20);
		Hs4.add(30);
		Hs4.add(90);
		Hs4.add(10);
		Hs4.add(10);
		Hs4.add(40);
		Hs4.add(50);
		
		HS4.add(30);
		HS4.add(40);
		HS4.add(50);
		HS4.add(60);
		HS4.add(80);
		
		System.out.println(" in Array1: "+Hs4);
		System.out.println(" in Array2: "+HS4);
		boolean addAll = HS4.addAll(Hs4);
		System.out.println("Hashset addall: "+addAll);
		System.out.println("Element in Hashset addall: "+HS4);

		HS4.removeAll(Hs4);
		System.out.println("Element in Hashset removeall: "+HS4);


	}

}
