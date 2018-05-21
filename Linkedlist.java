package com.coding.pract;

import java.util.Iterator;
import java.util.LinkedList;

public class Linkedlist {

	public static void main(String[] args) {
	LinkedList<String> al = new LinkedList<String>();
	al.add("Burhan");
	al.add("Ahemd");
	al.add("Owais");
	Iterator<String> ite = al.iterator();
	while(ite.hasNext()) {
		System.out.println(ite.next());
	}
	}
}
