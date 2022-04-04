package com.estyseesghosts.icspractice;

public class LastMultiple {
    public static void main() {
        int[] array = {4, 7, 9, 7, 12};
        System.out.println("Index: " + lastMultiple(array) + " Value: " + array[lastMultiple(array)]);
    }

    public static int lastMultiple(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) index = i; 
        }
        return index;
    }

}