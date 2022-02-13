package com.company.arrays.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class fourSum {
    public static List<List<Integer>> fourSumBruteForce(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        ArrayList<Integer> subResult = new ArrayList();
        int n = nums.length;

        //sort
        Arrays.sort(nums);

        for (int a=0; a < n-3; a++) {
            for (int b=a+1; b < n-2; b++) {
               int left = b+1;
               int right = n - 1;
               while (left <= right) {
                   int sum = nums[a] + nums[b] + nums[left] + nums[right];
                   if(sum > target) {
                      right--;
                   } else if(sum < target) {
                       left++;
                   } else {
                      subResult.add(nums[a]);
                      subResult.add(nums[b]);
                      subResult.add(nums[left]);
                      subResult.add(nums[right]);
                      left++;
                      right--;

                      result.add(subResult);
                      subResult = new ArrayList<>();
                   }
               }
            }
        }

        return result;
    }

    public static List<List<Integer>> fourSumOptimalHashMap(int[] nums) {
        List<List<Integer>> answer = new ArrayList<>();

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        System.out.println("Result: " + fourSumBruteForce(nums, 0));
    }
}
