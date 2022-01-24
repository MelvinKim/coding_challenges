package com.company.arrays.easy;

// Daily coding problem -> 273 [Easy]
/*
The problem
This problem was asked by Apple.

A fixed point in an array is an element whose value is equal to its index.
Given a sorted array of distinct elements, return a fixed point, if one exists. Otherwise, return False.
For example, given [-6, 0, 2, 40], you should return 2. Given [1, 5, 7, 8], you should return False.
*/

/*
Loop through all the array elements
compare the index to the current element value in that position
if equal , return the value/ index
else return false at the end
* */
public class fixedPoint {
        public static int fixedPointFinderBruteforce(int[] nums) {
            for (int i=0; i < nums.length; i++) {
                if(i == nums[i]) return i;
            }
            return -1;
        }

        public static int fixedPointFinderOptimal(int[] nums) {
            int start = 0;
            int end = nums.length;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                //check the 1st case
                if(nums[mid] > mid) {
                    end = mid - 1;
                } else if(nums[mid] < mid) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }

            return -1;
        }

    public static void main(String[] args) {
        int[] nums = {1,3,4,3,7};
        System.out.println(fixedPointFinderOptimal(nums));
    }
}
