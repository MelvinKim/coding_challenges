package com.company.arrays.medium;

import java.util.Arrays;
import java.util.Random;

public class shuffleArray {

    static int arr[];
    public shuffleArray(int[] nums) {
        arr = nums;
    }

    public int[] reset() {
        return arr;
    }

    public static int[] shuffle() {
        //create a copy of the original Array
        int copy[] = arr.clone();

        for (int i=copy.length-1; i > 0; i--) {
            int j = new Random().nextInt(i+1);
            //swap
            int temp = copy[i];
            copy[i] = copy[j];
            copy[j] = temp;
        }
        return copy;
    }

}
