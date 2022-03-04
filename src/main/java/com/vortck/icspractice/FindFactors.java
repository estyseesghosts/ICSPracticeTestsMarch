package com.vortck.icspractice;

import java.util.Arrays;

public class FindFactors {
    public static void main() {
        System.out.println(Arrays.toString(factor(8)));
    }

    public static int[] factor (int in) {
        String factors = "";
        for (int i = 1; i <= in; i++) {
            if (in % i == 0) factors += i + " ";
        }

        String[] work = factors.split(" ");
        int[] out = new int[work.length];

        for (int i = 0; i < work.length; i++) {
            out[i] = Integer.parseInt(work[i]);
        }

        return out;
    }
}