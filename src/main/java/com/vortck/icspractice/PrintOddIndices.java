package com.vortck.icspractice;

public class PrintOddIndices {
    public static void main()
    {
        int[] oddIndexArray = new int[] {1, 2, 3, 4, 5};
        printOddIndices(oddIndexArray);
    }
    public static void printOddIndices(int[] arr)
    {
        for (int i = 1; i < arr.length; i += 2) System.out.println(arr[i]);
    }
}
