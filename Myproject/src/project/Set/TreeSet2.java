package project.Set;
//question 3.2
import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> Ts2 = new TreeSet<Integer>();
		Ts2.add(10);
		Ts2.add(20);
		Ts2.add(30);
		Ts2.add(40);
		Ts2.add(50);
		Ts2.add(60);
		Ts2.add(70);
		Ts2.add(80);
		Ts2.add(90);
		Ts2.add(10);
		Ts2.add(20);
		System.out.println("Elments in a hashset are: "+Ts2);
		for (int x : Ts2) {
			System.out.println("Elements are: "+x);
			
		}

	}

}
