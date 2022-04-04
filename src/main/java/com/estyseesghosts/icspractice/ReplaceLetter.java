package com.estyseesghosts.icspractice;

public class ReplaceLetter {
    public static void main() {
        System.out.println(replaceLetter("Hello", 'l', 'y'));
    }

    public static String replaceLetter (String in, char ch1, char ch2) {
        char[] temp = in.toCharArray(); // Turns string to an array of chars to make it easier to work with
        
        String out = "";

        for (char x : temp) {
            if (x == ch1) x = ch2;
            out += x;
        }

        return out;
    }
}
