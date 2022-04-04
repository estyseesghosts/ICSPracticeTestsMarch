package com.estyseesghosts.icspractice;

public class PrintOddIndices {
    public static void main() {
        int[] oddIndexArray = new int[] {1, 2, 3, 4, 5};
        printOddIndices(oddIndexArray);
    }

    public static void printOddIndices(int[] arr) {
        for (int i = 1; i < arr.length; i += 2) System.out.println(arr[i]);
        // Loop starts at 1 instead of standard 0, and increments by 2 instead of 1
    }
}
