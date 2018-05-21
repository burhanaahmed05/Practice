
package com.coding.pract;

import java.util.HashMap;
import java.util.Map;

public class MapExample{
	public static void main(String[] args) {    
	    //Creating map of Books    
	    Map<Integer, HashMapConstructor> map=new HashMap<Integer,HashMapConstructor>();    
	    //Creating Books    
	   HashMapConstructor b1=new HashMapConstructor(11, "Burhan", "Ahmed", "inc");
	   HashMapConstructor b2 = new HashMapConstructor(11, "Owais", "Zoha", "Mohib");
	   HashMapConstructor b3 = new HashMapConstructor(22, "Ammi", "Nasreen", "Papa");
	   
	   map.put(1, b1);
	   map.put(2, b2);
	   map.put(3, b3);
	   for(Map.Entry<Integer, HashMapConstructor> entry:map.entrySet()) {
		   int key = entry.getKey();
		   HashMapConstructor b = entry.getValue();
		   System.out.println(key+"Details");
		   System.out.println(b.id+""+b.name+""+b.publisher+""+b.quantity);
	   }
}
}