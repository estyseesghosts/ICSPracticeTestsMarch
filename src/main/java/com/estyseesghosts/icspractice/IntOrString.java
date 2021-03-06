package com.estyseesghosts.icspractice;

public class IntOrString {
    public static void main() {
        System.out.println(intOrString("11123"));
        System.out.println(intOrString("1abc"));
        System.out.println(intOrString("abc"));
    }

    public static boolean intOrString (String input) {
        char[] temp = input.toCharArray();

        for (char i : temp) {
            if (Character.isDigit(i)) continue;
            else return false;
        }

        return true;
    }
}
