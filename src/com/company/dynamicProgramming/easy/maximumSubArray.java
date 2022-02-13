package com.company.dynamicProgramming.easy;

public class maximumSubArray {
    public static int maximumSubArray(int[] nums) {
        //set maxSum to be the first number in the Array
        int maxSum = nums[0];
        int currentSum = maxSum;
        int n = nums.length;

        for (int i=1; i < n; i++) {
            currentSum += nums[i];

            currentSum = Math.max(currentSum, nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {3,5,7,-1,7,-8,9,2,3};
        System.out.println("Maximum SubArray Sum: " + maximumSubArray(nums));
    }
}
