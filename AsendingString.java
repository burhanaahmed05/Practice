package com.coding.pract;

import java.util.Arrays;

public class AsendingString {

	public static void main(String[] args) {
		String[] a= {"Burhan","Ahmed","Owais","Ahmed"};
		System.out.println("Ascending order in java");
		printNumber(a1);
		Arrays.sort(a1);
		System.out.println("Sorted String in ascending order:");
		printNumber(a1);
		//Decending order
		
		System.out.println("Sorting part of array in java");
		int [] number = {1,2,3,7,5};
		Arrays.sort(number,0,3);
		System.out.println("Sorted in java");
		for (int num:number) {
			System.out.println(num);
		}
	}

	public static void printNumber(String[] a1) {
		for(String a : a1) {
			System.out.println(a);
		}
		
	}
}
