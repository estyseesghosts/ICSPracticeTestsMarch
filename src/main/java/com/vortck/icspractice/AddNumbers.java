package com.vortck.icspractice;

public class AddNumbers {
    public static void main() {
        addNumbers(8);
    }

    public static void addNumbers(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) sum += i;
        System.out.println(sum);
    }
}
