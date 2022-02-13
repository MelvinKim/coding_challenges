package com.company.arrays.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountingElements {
    //O(N*N) Time | O(1) Space
    public static int countElementsBruteForce(int[] nums) {

        //if given an empty array
        if(nums.length == 0) return 0;

        int count = 0;
        int n = nums.length;

        for (int i=0; i < n; i++) {
            for (int j=0; j < n; j++) {
                if(nums[j] == nums[i] +1) {
                    count++;
                    break;
                }
            }
        }

        return count;
    }

    //O(N*logN  + N) Time | O(1) Space
    public static int countElementsBySorting(int[] nums) {

        //edge case
        if(nums.length == 0) return 0;

        int n = nums.length;
        int left = 0;
        int right = 1;
        int count = 0;

        //sort the array        //0(N*Log N)
        Arrays.sort(nums);

        while (right < n) {     //0(N)
            if(nums[right] == (1 + nums[left])) {
                count += (right -left);
                left = right;
                right++;
            } else if(nums[right] == nums[left]) {
                right++;
            } else {
                left = right;
                right++;
            }
        }

        return count;
    }

    //O(N) Time | O(1) Space
    public static int countElementsUsingHashMap(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        //populate the map      //O(N) Time
        for (int i : nums) {
            if(!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.put(i, map.get(i) + 1);
            }
        }

        //perform the real logic --> loop over all the keys
        for (Integer key : map.keySet()) {      //O(N) Time
            if(map.containsKey(key + 1)) {
                count += map.get(key);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,3,5,0};
        System.out.println("Count Elements: " + countElementsUsingHashMap(nums));
    }
}
