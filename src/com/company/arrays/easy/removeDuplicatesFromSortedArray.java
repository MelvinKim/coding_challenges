package com.company.arrays.easy;

public class removeDuplicatesFromSortedArray {
    //used pointers
    public static int removeDuplicates(int[] nums) {
        int index = 1;
        for (int i=0; i < nums.length -1; i++) {
            if(nums[i] != nums[i+1]) {
                nums[index] = nums[i + 1];
                index++;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println("Unique elements: " + removeDuplicates(nums));
    }
}
