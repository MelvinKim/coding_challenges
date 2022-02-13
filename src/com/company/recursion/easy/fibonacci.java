package com.company.recursion.easy;

import java.util.ArrayList;
import java.util.List;

public class fibonacci {
    public static int fibBruteForce(int n) {

        //base case 1
        if(n == 0) {
            return 0;
        }
        //base case 2
        if(n == 1) {
            return 1;
        }

        return fibBruteForce(n - 1) + fibBruteForce(n-2);
    }

    public static int fibOptimalUsingArray(int n) {

        //declare array
        int[] fib_numbers = new int[n];
        fib_numbers[0] = 0;
        fib_numbers[1] = 1;

        for (int i=2; i < n; i++) {
            fib_numbers[i] = fib_numbers[i-1] + fib_numbers[i-2];
        }

        //Remember to change
        return fib_numbers[n-1];
    }

    public static void main(String[] args) {
        System.out.println("Optimal Value: " + fibOptimalUsingArray(3));
        System.out.println("BruteForce Value: " + fibBruteForce(3));
    }
}
