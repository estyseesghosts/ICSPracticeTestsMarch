package com.vortck.icspractice;

import java.lang.Integer;
import java.lang.Math;
import java.util.Scanner;

public class CubeSums {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your cubesum ");
            int check = cubesum(scanner.nextLine());
            if (check == 3) break;
            switch (check) {
                case 0:
                    System.out.println("Cubesum.");
                    break;
                case 1:
                    System.out.println("Not a cubesum.");
                    break;
                case 2:
                    System.out.println("Bad input.");
                    break;
            }
        }
    }

    public static int cubesum (String num) {
        int temp = Integer.parseInt(num);
        System.out.println(num);
        System.out.println(temp);
        if (temp < 0) return 3;
        if (temp < 100 || temp > 999) return 2;

        int check = 0, add = 0;

        for (int i = 0; i < num.length(); i++) {
            add = (int) Math.pow(Integer.parseInt(num.substring(i)), 3);
            System.out.println(num.substring(i));
            System.out.println(add);
            check += add;
        }
        if (check != temp) return 1;
        else return 0;
    }
}
