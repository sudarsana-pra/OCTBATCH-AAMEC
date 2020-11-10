package project.Set;
//4.3 create a new treeset and return the common values
import java.util.TreeSet;

public class TreeSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> Ts3 = new TreeSet<Integer>();
		TreeSet<Integer> TS3 = new TreeSet<Integer>();
		Ts3.add(10);
		Ts3.add(20);
		Ts3.add(30);
		Ts3.add(40);
		Ts3.add(50);
		Ts3.add(60);
		Ts3.add(70);
		Ts3.add(80);
		
		TS3.add(100);
		TS3.add(200);
		TS3.add(300);
		TS3.add(400);
		TS3.add(500);
		TS3.add(600);
		TS3.add(700);
		TS3.add(8000);
		
		System.out.println("Elements in 1st array: "+Ts3);
		System.out.println("Elements in 2nd array: "+TS3);
		Ts3.retainAll(TS3);
		System.out.println("Array after retaining: "+Ts3);
			

	}

}
