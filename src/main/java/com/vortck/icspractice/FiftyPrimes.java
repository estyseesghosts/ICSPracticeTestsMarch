package com.vortck.icspractice;
import java.lang.Math;
import java.lang.Integer;

public class FiftyPrimes{
	public static void fiftyPrimes() {
		int index = 1;
		int counter = 0;
		while (counter <= 50) {
			if (!isPrime(index)) {
				index++;
				continue;
			}
			System.out.println(index);
			counter++;
			index++;
			continue;
		}
	}

	static boolean isPrime (int input) {
		for (int i = 2; i <= input*1.0/2.0; i++) {
			double x = (double) input / i;
			if (x-(int)x==0) return false;
		}
		return true;
	}
}
