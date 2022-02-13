package com.company.dynamicProgramming.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generatePascal(int numRows) {

        List<List<Integer>> allRows = new ArrayList<>();
        List<Integer> row = new ArrayList<>();

        //base case
        if(numRows == 0) return allRows;

        for (int i=0; i < numRows; i++) {
            row.add(0, 1);
            for (int j=1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j+1));
            }

            allRows.add(new ArrayList<>(row));
        }

        return allRows;
    }

    //solution 2
    public static List<List<Integer>> generatePascalNickWhite(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if(numRows == 0) return triangle;

        //add the First Row
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i=1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i-1);
            List<Integer> currentRow = new ArrayList<>();

            //...add 1 at the beginning of each row
            currentRow.add(1);
            //generate the current Row elements from the previous row
            for (int j=1; j < i; j++) {
                currentRow.add(prevRow.get(j) + prevRow.get(j-1));
            }

            //...add 1 at the end of each currentRow
            currentRow.add(1);
            triangle.add(currentRow);
        }



        return triangle;
    }


    public static void main(String[] args) {
        System.out.println(generatePascalNickWhite(6));
    }
}
