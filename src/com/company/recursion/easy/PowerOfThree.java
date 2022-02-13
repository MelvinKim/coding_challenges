package com.company.recursion.easy;

public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        //base case
        if(n == 0) {
            return false;
        }
        if(n == 1) {
            return true;
        }
        if(n % 3 != 0 ) {
          return false;
        }


        return isPowerOfThree(n / 3);
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println(n + " is a Power of Three: " + isPowerOfThree(n));
    }
}
