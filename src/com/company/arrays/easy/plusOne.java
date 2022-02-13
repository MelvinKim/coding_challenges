package com.company.arrays.easy;

import java.util.Arrays;

public class plusOne {
    public static int[] plusOne(int[] digits) {

        int carry = 0;
        int n = digits.length;
        int sum = 0;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        //check if the beginning -> incase the most significant number is 0
        if(digits[0] == 0) {
            int[] result = new int[n+1];
            result[0] = 1;
            for (int j=1; j < n; j++) {
                result[j] = digits[j];
            }
            return result;
        }

        //remember to change
        return digits;
    }

    public static void main(String[] args) {
        int[] nums = {5,9,9};
        System.out.println(Arrays.toString(plusOne(nums)));
    }
}
