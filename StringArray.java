package com.basic;

public class StringArray {

	public static void main(String[] args) {
		String[] words = new String[3];
		words[0] = "Hello";
		words[1] = "TO";
		words[2] = "You";
		System.out.println(words[2]);
		String [] Fruits = {"Apple","Banana","pear","Kiwi"};
		
		for(String fruit:Fruits) {
			System.out.println(fruit);
		}
		int value = 123;
		String text = null;
		System.out.println(text);
		String[] texts = new String[2];
		System.out.println(texts[2]);
		texts[0] = "One";
		texts[1] = "TWO";
		texts[2] = "Three";
		for(String Te : texts) {
			System.out.println(texts);
		}
	}
}
