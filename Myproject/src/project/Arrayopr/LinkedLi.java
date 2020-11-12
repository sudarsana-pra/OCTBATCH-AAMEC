package project.Arrayopr;
//Array list
//qus 4.2
import java.util.LinkedList;


public class LinkedLi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> Ll = new LinkedList<Integer>();
		
		Ll.add(100);
		Ll.add(200);
		Ll.add(300);
		Ll.add(400);
		Ll.add(500);
		Ll.add(600);
		Ll.add(700);
		System.out.println("Elements in a linkedlist are: "+Ll);
		int size = Ll.size();
		System.out.println("Size of the linkedlist is : "+size);
		
		}

}
