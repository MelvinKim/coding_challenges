package com.company.strings.medium;

import java.util.Arrays;

public class ShiftingLetters {
    public static String shiftingLetters(String s, int[] shifts) {

        int shift = 0;
        char[] str = s.toCharArray();

        for (int i= str.length-1; i>=0; i--) {
            shift = (shift + shifts[i]) % 26;
            str[i] = (char) ((str[i] - 'a' + shift) % 26 + 'a');
        }

        return String.valueOf(str);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3};
        System.out.println(shiftingLetters("aaa", array));
    }
}
