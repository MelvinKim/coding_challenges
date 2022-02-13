package com.company.recursion.easy;

public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        //handle the base cases
        if(n == 0) {
            return false;
        }
        if(n == 1) {
            return true;
        }
        //if n is not , divisible by 4, there's no way it can be a power
        if(n % 4 != 0) {
            return false;
        }

        return isPowerOfFour(n / 4);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(18));
    }
}
