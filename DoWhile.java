package com.basic;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		/*int value = scan.nextInt();
		while(value!=5) {
			System.out.println("Enter a number:");
		 value = scan.nextInt();
		}*/
		
		
		int value;
		do {
			System.out.println("Enter the number");
		 value = scan.nextInt();
				
		}
		while(value !=5);
		System.out.println("Got 5");
}
}