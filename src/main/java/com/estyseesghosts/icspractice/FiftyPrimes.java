package com.estyseesghosts.icspractice;

public class FiftyPrimes{
	public static void fiftyPrimes() {
		int index = 1;
		int counter = 1;

		while (counter <= 50) {
			if (isPrime(index)) {
				counter++;
				System.out.println(index);
			}
			index++;
		}
	}

	static boolean isPrime (int input) {
		/*
			could easily make this more efficient but idc! 
		*/
		if (input <= 1) return false; 

		int factors = 0;

        for (int i = 1; i <= input; i++) {
            if (input % i == 0) factors++;
        }

		return (factors == 2);
	}
}
