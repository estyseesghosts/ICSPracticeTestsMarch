package com.estyseesghosts.icspractice;

import java.util.Scanner;

class Rectangle {

	final static char BK = '*'; // block character
	final static char SP = ' '; // space character
	final static String NL = "\n"; // newline

	public static void main() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("What's the width? ");
		int width = scanner.nextInt();

		System.out.print("What's the height? ");
		int height = scanner.nextInt();
		
		System.out.print("Will it be hollow? ('true' or 'false') ");
		boolean hollow = scanner.nextBoolean();

		rectangle(width, height, hollow);
	}

	public static void rectangle(int width, int height) {
		/*
			Ints width and height for, well, width and height d: 
			Basically: 
				- it checks that width and height are at least 3
				- creates the string rectangle filled with the block character and adds a newline character to the end
				- creates the empty string fin, which will be printed at the end
				- loop adds the filled line to the string fin, height times 
				- prints out fin
		*/
		if (height <=2 && width <=2) return;

		String rectangle = Character.toString(BK).repeat(width) + NL;

		String fin = "";

		for (int i = 1; i <= height; i++) fin += rectangle;

		System.out.println(fin);
	}

	public static void rectangle(int width, int height, boolean hollow) {
		/*
			Ints width and height and bool hollow
			Basically: 
				- it checks that width and height are at least 3
				- if hollow is false, run the first method for a solid rectangle
				- creates the string rec1 filled with the block character and adds a newline at the end
				- creates the string rec2 with a block, width-2 spaces, another block and a newline
				- creates the empty string recOut, which will be printed at the end
				- loop adds the hollow line to the string recOut, height-2 times 
				- adds the filled line to the start and end of recOut
				- prints out recOut
		*/

		if (height <=2 && width <=2) return;
		if (!hollow) {
			rectangle(width, height);
			return;
		}

		String rec1 = Character.toString(BK).repeat(width) + NL;
		String rec2 =  BK + Character.toString(SP).repeat(width-2) + BK + NL;

		String recOut = "";

		for (int i = 1; i <= height-2; i++) {
			recOut += rec2;
		}

		recOut = rec1 + recOut + rec1;

		System.out.println(recOut);
	}
}
