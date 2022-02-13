package com.company.recursion.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductSum {
    public static int productSum(List<Object> array) {

        return productSumHelper(array, 1);
    }

    public static int productSumHelper(List<Object> array, int depth) {
        int sum = 0;

        //loop over the contents of the special array
        for (Object obj : array) {
            //checking if the object is an instance of an ArrayList
            if(obj instanceof ArrayList) {
                @SuppressWarnings("unchecked")
                ArrayList<Object> ls = (ArrayList<Object>) obj;
                //recursively call the function inside the arrayList
                sum += productSumHelper(ls, depth + 1);
            } else {
                //if not an ArrayList , meaning it's a number, add it to the sum
                sum += (int) obj;
            }
        }

        return sum * depth;
    }

    public static void main(String[] args) {

    }
}

/*
-
* */
