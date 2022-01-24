package com.company.arrays.medium;

import java.util.Arrays;

//75. Sort Colors
/*
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent,
with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.
 */
public class sortColors {
    public static void sortColors(int[] nums) {
        int n = nums.length;
        int redCount = 0;
        int whiteCount = 0;
        int blueCount = 0;

        for (int a: nums) {
            if(a==0) {
                redCount++;
            } else if(a==1) {
                whiteCount++;
            } else if(a==2) {
                blueCount++;
            }
        }

        //re-arrange the array -> for multiple for loops, use while loops instead
        int idx = 0;
        while(redCount > 0) {
            nums[idx++] = 0;
            redCount--;
        }
        while(whiteCount > 0) {
            nums[idx++] = 1;
            whiteCount--;
        }
        while(blueCount > 0) {
            nums[idx++] = 2;
            blueCount--;
        }

        System.out.println("New Array: " + Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = {2,0,1};
        sortColors(nums);
    }
}

/*
Lesson learnt:
1. for a case where you have to use multiple for loops : use while loops instead
*/
