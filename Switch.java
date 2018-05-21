package com.basic;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the text");
		String text = scan.nextLine();
		switch (text) {
		case "Start":

			System.out.println("machine started");
			break;

		case "Stop":
			System.out.println("Machine Stop");
			break;
		default:
			System.out.println("Command is not recognize");
		}
	}
}
