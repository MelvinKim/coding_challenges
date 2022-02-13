package com.company.recursion.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    //solution 1 -> using the first concerp
    public static List<List<Integer>> getPermutationsSolution1(List<Integer> array) {
        List<List<Integer>> permutations = new ArrayList<>();
        permutationsHelper(array, new ArrayList<>(), permutations);
        return permutations;
    }

    private static void permutationsHelper(List<Integer> array, List<Integer> currentPermutation, List<List<Integer>> permutations) {
        //base case -> check if we have numbers in the list array and the currentPermutation contains numbers
        if(array.size() == 0 && currentPermutation.size() > 0) {
            permutations.add(currentPermutation);
        }
        else {
            for (int i=0; i < array.size(); i++) {
                //remove the current number from our array
                List<Integer> newArray = new ArrayList<>(array);
                newArray.remove(i);
                List<Integer> newPermutation = new ArrayList<>(currentPermutation);
                newPermutation.add(array.get(i));

                permutationsHelper(newArray, newPermutation, permutations);
            }
        }
    }


    //solution 2 -> Using the swapping and re-swapping concept
    public static List<List<Integer>> getPermutationsSolution2(List<Integer> array) {
        List<List<Integer>> permutations = new ArrayList<>();
        permutationsHelper2(0, array, permutations);
        return permutations;
    }

    private static void permutationsHelper2(int i, List<Integer> array, List<List<Integer>> permutations) {
        //check the base case -> when i reached the end
        if(i == array.size()-1) {
            //append a snapshot of our current array
            permutations.add(new ArrayList<>(array));
        }
        else {
            for (int j=i; j < array.size(); j++) {
                //swap
                swap(array, i, j);
                //make a recursive call --> incrementing the value of i
                permutationsHelper2(i+1, array, permutations);
                //re-swap
                swap(array, i, j);
            }
        }
    }

    private static void swap(List<Integer> array, int i, int j) {
        Integer tmp = array.get(i);
        array.set(i, array.get(j));
        array.set(j, tmp);
    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println("Permutations: " + getPermutationsSolution2(array));
    }
}
