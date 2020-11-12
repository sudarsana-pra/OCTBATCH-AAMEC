package citi.arr;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapPrg {
public static void main(String[] args) {
	
	Map<Integer, String> mp = new HashMap<Integer, String>();
	mp.put(1, "Mani");
	mp.put(2, "vannan");
	mp.put(3, "Boss");
	mp.put(4, "Thamil");
	mp.put(5, "selvan");
	System.out.println("Output of put method :"+mp);
		
	//to check whether key is present or not
	boolean keyCon = mp.containsKey(4);
	System.out.println("Output of contains method :"+keyCon);
	
	//to check whether value is present or not
	boolean valueCon = mp.containsValue("selvan");
	System.out.println("Output of contains method :"+valueCon);
	
	//to get particular value 
	String value = mp.get(2);
	System.out.println("Output of value corresponding for key  :"+value);
	
	//to get particular value
		Collection<String> val = mp.values();
		System.out.println("values alone :" +val);
		
		//iteration using enhanced for loop
		
		for (String X : val) {
			System.out.println(X);
		}
		mp.getOrDefault(1, "");
	///to get key
		Set<Integer> keySet = mp.keySet();
		System.out.println("key alone :" +keySet);
			for (int Y : keySet) {
			System.out.println(Y);
		}
		
	Set<Entry<Integer, String>> entrySet = mp.entrySet();	
		for (Entry<Integer, String> X : entrySet) {
			System.out.println(X.getKey());
			System.out.println(X.getValue());
		}
		
		for (int i = 0; i < args.length; i++) {
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
}
}
