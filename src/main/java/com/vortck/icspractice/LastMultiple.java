package com.vortck.icspractice;

public class LastMultiple {
    public static void main() {
        int[] array = {4, 7, 9, 7, 12};
        System.out.println(lastMultiple(array));
    }

    public static int lastMultiple(int[] array) {
        int temp = 0;
        for (int i : array) {
            if (i % 3 == 0) temp = i;
        }
        return temp;
    }

}