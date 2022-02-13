package com.company.arrays.easy;

public class maximumSubArray {
    public static int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        int current_sum = max_sum;

        for (int i=1; i < nums.length; i++) {
            current_sum = Math.max(current_sum + nums[i], nums[i]);
            max_sum = Math.max(current_sum, max_sum);
        }

        return max_sum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1};
        System.out.println("maxSum: " + maxSubArray(nums));
    }
}
