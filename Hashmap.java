package com.coding.pract;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "let us C");
		map.put(102, "Operating system");
		map.put(103, "Data commmunication and networking");
		for(int i =0; i<map.size(); i++) {
		System.out.println("Values before remove"+map);
		}
		map.remove(102);
		System.out.println("Value after Remove"+map);
	}
}
