package com.estyseesghosts.icspractice;

import java.util.Scanner;
import java.lang.Math;

public class AvgMark {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        double avg = 0, in = 0;
        int cnt = 0;

        while (true) {
            System.out.print("What's the average? Input negative number to stop ");
            in = scanner.nextDouble();
            if (in < 0) break;
            avg += in;
            cnt ++;
        }

        System.out.println(Math.round((avg+0.5)/cnt) + "%");
    }
}
