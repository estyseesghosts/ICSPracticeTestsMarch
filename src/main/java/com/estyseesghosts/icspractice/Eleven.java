package com.estyseesghosts.icspractice;

import java.util.Scanner;
import java.lang.Integer;

class Eleven {
	public static void main () {
		Scanner scanner = new Scanner (System.in);

		System.out.println("What's the number? ");
	    int check = scanner.nextInt();

		System.out.println(eleven(check));	
	}
	
	public static boolean eleven (int in) {
		// i'm sorry if you don't understand this
		// (i don't either, good luck LMFAO)
		while (in > 9) {
			String input = Integer.toString(in);
			int work = Integer.parseInt(input.substring(input.length()-1, input.length()));
			input = input.substring(0, input.length()-1);
			in = Integer.parseInt(input);
			in -= work;
		}

		if (in != 0) return false;
		else return true;	
	}
}
