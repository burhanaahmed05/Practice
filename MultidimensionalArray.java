package com.basic;

public class MultidimensionalArray {

	public static void main(String[] args) {
		int [] value = {1,2,3,44};
		System.out.println(value[2]);
		int [][] grid = {
				{3,4,5,555},
				{2,4,5},
				{2,3,4,5}	
		};
		System.out.println(grid[1][1]);
		System.out.println(grid[0][2]);
		String [][] texts = new String[2][3];
		texts[0][1] = "Hello There";
		System.out.println(texts[0][1]);
		
		for(int row=0; row<grid.length; row++) {
			for(int col = 0; col<grid[row].length; col++) {
				System.out.println(grid[row][col]+ "\t");
			}
			System.out.println();
		}
		String[][] words = new String[2][];
		System.out.println(words[0]);
		words[0] = new String[3];
		words[0][1] = "hi there";
		System.out.println(words[0][1]);
			}
}
