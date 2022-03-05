package com.vortck.icspractice;

import java.util.Scanner;
import java.util.Arrays;

class Rectangle {
	static final String BLOCK = "*";
	static final String SPACER = " ";

	public static void main() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("What's the width? ");
		int width = scanner.nextInt();

		System.out.print("What's the height? ");
		int height = scanner.nextInt();
		
		String[] out = new String[height];
		String black = "";
		String hollow = "";
		for (int i = 0; i < width; i++) {
			black += BLOCK;
			hollow += SPACER;
		} 
		
		hollow = BLOCK + hollow.substring(1, hollow.length()-1) + BLOCK;

		for (int i = 0; i < out.length; i++) {
			if (i == 0 || i == out.length-1) out[i] = black;
			else out[i] = hollow;
		}

		for (int i = 0; i < out.length; i++) System.out.println(out[i]); 
		
	}
}
