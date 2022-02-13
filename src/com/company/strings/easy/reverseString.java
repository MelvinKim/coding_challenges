package com.company.strings.easy;

import java.util.Arrays;

public class reverseString {
    public static void reverseString(char[] s) {
        int n = s.length;

        System.out.println("Initial Array:" + Arrays.toString(s));

        int left = 0;
        int right = n - 1;
        while (left <= right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }

        System.out.println("reversed Array: " + Arrays.toString(s));
    }

    public static void main(String[] args) {
        char[] s = {'H','a','n','n','a', 'h'};
        reverseString(s);
    }
}
