package com.coding.pract;

public class Asending_Order {
public static void main(String[] args) {
	
	int n, temp;
	int [] a = {12,43,45,4,565,76};
	for(int i=0; i<a.length; i++) {
		for(int j=i+1; j<a.length; j++) {
			if(a[i]>a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}}
	}
	System.out.println("Asending order");
	for(int i=0; i<a.length; i++) {
		System.out.println(a[i]);
	}
	System.out.println(a[a.length-1]);
}

}