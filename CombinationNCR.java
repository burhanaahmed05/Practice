package com.coding.pract;

import java.util.Scanner;

public class CombinationNCR {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n,r,ncr;
		System.out.println("Please enter two number");
		n=scan.nextInt();
		r = scan.nextInt();
		ncr=fact(n)/ (fact(r)*fact(n-r));
		System.out.println("The NCR Factor of"+n+"and"+r+"is"+r);
	}
	public static int fact(int n) {
		int i=1;
		while(n!=0) {
			i=i*n;
			n--;
		}
		return i;
	}
}
