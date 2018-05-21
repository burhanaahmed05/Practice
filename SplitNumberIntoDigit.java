package com.coding.pract;

import java.util.Scanner;

public class SplitNumberIntoDigit {

	public static void main(String[] args) {
		int num, temp, factor =1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number");
		num = scan.nextInt();
		temp=num;
		while(temp !=0) {
			temp = temp/10;
			factor = factor*10;
		}
		System.out.println("Each digit of given muber");
		while(factor>1) {
			factor = factor/10;
			System.out.println(num/factor+"");
			num = num%factor;
		}
	}
}
