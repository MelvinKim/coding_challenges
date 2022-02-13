package com.company.arrays.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    //==> used a HashMap
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num_map = new HashMap<>();

        for (int i=0; i<nums.length; i++) {
            int compliment = target - nums[i];

            if(num_map.containsKey(compliment)) {
                return new int[] {num_map.get(compliment), i};
            } else {
                num_map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No matching elements found");
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        System.out.println("Indices: " + Arrays.toString(twoSum(nums, 6)));
    }
}
