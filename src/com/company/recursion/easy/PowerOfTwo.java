package com.company.recursion.easy;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        //handle the base cases
        if(n == 0) {
            return false;
        }
        if(n == 1) {
            return true;
        }
        //if n is not divisible by two, there's no way it can be a power
        if(n % 2 != 0) {
            return false;
        }

        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(64));
    }
}
