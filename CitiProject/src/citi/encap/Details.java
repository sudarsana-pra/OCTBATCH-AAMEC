package citi.encap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Details {
	public static void main(String[] args) {
		// 1 st employee
		Employee Det = new Employee();
		Det.setId(10);
		Det.setName("Mani");

		// 2 nd employee
		Employee Det1 = new Employee();
		Det1.setId(20);
		Det1.setName("vannan");

		// 3 rd employee
		Employee Det2 = new Employee();
		Det2.setId(30);
		Det2.setName("boss");

		// user defined list
		List<Employee> Li = new ArrayList<Employee>();
		Li.add(Det);// size 1 id, name
		Li.add(Det1);// size 2 id , name
		Li.add(Det2);// size 3 id, name
		for (int i = 0; i < Li.size(); i++) {
			System.out.println("ID is :" + Li.get(i).getId());
			System.out.println("Name is :" + Li.get(i).getName());
		
		//user defined Set
			Set<Employee> li = new LinkedHashSet<Employee>();
			li.add(Det);
			li.add(Det1);
			li.add(Det2);
			System.out.println("user defined Set:");
			for (Employee X : li) {
				System.out.println("Id is : "+X.getId());
				System.out.println("Name is : "+X.getName());
		// user defined Map
			Map<Integer,Employee> mp = new LinkedHashMap<Integer,Employee>();
			mp.put(1, Det);//key 1 --> employee 1
			mp.put(2, Det1);// key 2 --> emp2
			mp.put(3, Det2);//key 3 -->emp 3
			Set<Entry<Integer, Employee>> es = mp.entrySet();
			for (Entry<Integer, Employee> Y: es) {
				System.out.println(Y.getKey()+ "Employee Details");
				System.out.println("ID :"+Y.getValue().getId());
				System.out.println("ID :"+Y.getValue().getName());
						}
			
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		}
	}
}
