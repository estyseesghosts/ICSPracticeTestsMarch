package com.vortck.icspractice;
import java.util.Scanner;
import java.lang.Math;
import java.lang.Integer;

public class CubeSums2 {
	public static void cubeSum() {
	Scanner scanner = new Scanner(System.in);
	while (true) {
		System.out.print("Enter your number: ");	
		String cubesum = scanner.nextLine();
		char[] cubes = cubesum.toCharArray();
		if (charToInt(cubes[0]) == -1) break;
		if (cubes.length != 3) {
			System.out.println("Bad input");
			continue;
		}	

		int og = Integer.parseInt(cubesum);
		int check = 0;
		
		for (int i = 0; i < 3; i++) {
			int te = charToInt(cubes[i]);
			check += cube(te);
		}

		if (check == og) {
			System.out.println("Cubesum.");
			continue;
		}

		else System.out.println("Not a cubesum. ");
	}

	}

	private static int charToInt(char i) {
		int t = (int) i;
		t -= 48;
		if (t < 0 || t > 9) return -1;
		else return t;
	}

	private static int cube(int i) { return (int) Math.pow(i, 3); }

}
