package com.vortck.icspractice;

public class ReplaceLetter {
    public static void main() {
        System.out.println(replaceLetter("Hello", 'l', 'y'));
    }

    public static String replaceLetter (String in, char ch1, char ch2) {
        char[] temp = in.toCharArray();
        String out = "";
        for (char x : temp) {
            if (x == ch1) x = ch2;
            out += x;
        }
        return out;
    }
}