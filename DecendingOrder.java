package com.coding.pract;

public class DecendingOrder {

	public static void main(String[] args) {
		int n, temp;
		int [] a = {121,23,343,5,5,1};
		for(int i=0; i<a.length; i++) {
			for(int j =i+1; j<a.length; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Decending Order");
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]+"");
		}
		System.out.println(a[a.length-1]);
	}
}
