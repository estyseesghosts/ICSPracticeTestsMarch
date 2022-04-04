package com.estyseesghosts.icspractice;

import java.util.Arrays;

public class FindFactors {
    public static void main() {
        System.out.println(Arrays.toString(factor(53)));
    }

    public static int[] factor (int in) {
        /*
            basically this one first finds how many factors there are 
            then makes a new list of that length 
            then adds the factors to the array out 

            i originally did some weird shit with strings to give me a variable length-
            array but honestly its complex and annoying to read so i redid it 

            i also added the if statement to see if the number is prime and-
            if it is it skips the entire last loop
        */

        int factors = 0; int counter = 0;

        for (int i = 1; i <= in; i++) {
            if (in % i == 0) factors++;
        }

        if (factors == 2) {
            int[] out = new int [2];
            out[0] = 1;
            out[1] = in;
            return out;
        }

        int[] out = new int[factors];

        for (int i = 1; i <= in; i++) {
            if (in % i == 0) {
                out[counter] = i;
                counter++;
            }
        }

        return out;
    }
}