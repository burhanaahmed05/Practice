package com.coding.pract;

import java.util.HashMap;



public class Collection {
	
	int id;
	public Collection(int id) {
		this.id = id;
		
	}

	public static void main(String[] args) {
		Collection c = new Collection(101);
		Collection c1 = new Collection(101);
java.util.Map<Collection, String>	map = new HashMap<Collection, String>();
map.put(c,"Burhan");
map.put(c1,"Burhan");
System.out.println(map.size());
Integer i = new Integer(101);
Integer i1 = new Integer(101);
java.util.Map<Integer, String> map1 = new HashMap<Integer, String>();
map1.put(i, "Burhan");
map1.put(i1, "Burhan");
System.out.println(map1.size());
	}
}
