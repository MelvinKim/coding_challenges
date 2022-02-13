package com.company.dynamicProgramming.easy;

public class climbingStairs {
    //solution 1
    public static int climbStairsBottomUp(int n) {
        int[] arr = new int[n+1];
        arr[0] = 1;
        arr[1] = 1;

        for (int i=2; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }

        return arr[n];
    }

    //solution 2
    public static int climbStairsTopDown(int n) {

        if (n <= 2) return n;

        int x = 1;
        int y = 2;
        for (int i=3; i <n; i++) {
            int temp = y;
            y += x;
            x = temp;
        }

        return x+y;
    }

    public static void main(String[] args) {
        System.out.println("Number of ways: Top Down " + climbStairsTopDown(6));
        System.out.println("Number of ways: Bottom up " + climbStairsBottomUp(6));
    }
}
