package com.company.strings.easy;

public class ExcelSheetColumnNumber {
    public static int titleToNumber(String s) {

        int columnNumber = 0;
        int n = s.length() - 1;

        for (int i=0; i < s.length(); i++) {
            columnNumber = columnNumber + (s.charAt(n-i) - 'A' + 1) * (int) Math.pow(26, i);
        }

        return columnNumber;
    }

    public static void main(String[] args) {
        System.out.println("Column Number: " + titleToNumber("AR"));
    }
}
