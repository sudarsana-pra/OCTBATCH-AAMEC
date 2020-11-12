package project.Arrayopr;
//7.1 remove the value present in 2nd index
import java.util.ArrayList;

public class ArrayRemove {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> Alremove = new ArrayList<Integer>();
		Alremove.add(10);
		Alremove.add(20);
		Alremove.add(30);
		Alremove.add(40);
		Alremove.add(50);
		Alremove.add(60);
		System.out.println("Elements in an array are: "+Alremove);
		Integer remove = Alremove.remove(2);
		System.out.println("After removing 2nd index element is:"+remove);
		
	}

}
