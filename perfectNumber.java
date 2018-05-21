// a perfect number is a positive integer that is equal to the sum of its proper positive divisors, that is, the sum of its positive divisors excluding the number itself.
package com.coding.pract;

import java.util.Scanner;

public class perfectNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, i=1, sum=0;
		System.out.println("Enter the number");
		n=scan.nextInt();
		while(i<n) {
			if(n%i==0) {
				sum = sum +i;
				
			}
			i++;
		}
		if(sum ==n) {
			System.out.println(i+"is a perfect number");
		}
		else {
			System.out.println("This is not perfect number");
		}
	}

}
