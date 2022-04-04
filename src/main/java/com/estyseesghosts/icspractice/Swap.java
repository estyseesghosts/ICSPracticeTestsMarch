package com.estyseesghosts.icspractice;

import java.util.Arrays;

public class Swap {

    public static void main() {
        double[] list = {1.0, 2, 3, 4.2, 777, 10, 12};
        swap(list, 3, 5);
    }

    public static void swap(double[] list, int i, int j) {

        if (i < 0 || i >= list.length) return;
        else if (j < 0 || j >= list.length) return;
        // Makes sure there's no out of index errors 

        System.out.println(Arrays.toString(list)); // Prints the original list before swap

        double temp = list[i];
        list[i] = list[j];
        list[j] = temp;

        System.out.println(Arrays.toString(list)); // Prints the swapped list
    }
}
