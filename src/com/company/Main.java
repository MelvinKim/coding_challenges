package com.company;

public class Main {

    public static int solution(int[] nums_1, int[] nums_2) {
        int n = nums_1.length;
        int maxAbsDiff = 0;

        for (int i=0; i < n; i++) {
            int currAbsDiff = 0;
            currAbsDiff = Math.abs(nums_1[i] - nums_2[i]);

            maxAbsDiff = Math.max(maxAbsDiff, currAbsDiff);
        }

        return maxAbsDiff;
    }

    public static int totalDiffHelper(int[] nums_1, int[] nums_2, int size) {

        //handle the base case
        if(size == 0) {
            return 0;
        }

        int currDiff = Math.abs(nums_1[size - 1] - nums_2[size -1]);
        int totalDiff = totalDiffHelper(nums_1, nums_2, size - 1) + currDiff;

        return totalDiff;
    }

    public static void main(String[] args) {

        int[] nums_1 = {15,-4, 56, 10, -23};
        int[] nums_2 = {14, -9, 56, 14, 23};

        System.out.println("Total Absolute Difference: " + totalDiffHelper(nums_1, nums_2, 5));
    }
}
