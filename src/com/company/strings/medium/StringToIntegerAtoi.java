package com.company.strings.medium;

//LeetCode 8. String to Integer (atoi)
public class StringToIntegerAtoi {

    public static int myAtoi(String s) {

        //check the base case
        if(s.length() == 0 || s == null) return 0;

        int sign = 1;
        int index = 0;
        int n = s.length();

        //eliminate / skip the whitespaces
        while (index < n && s.charAt(index) == ' ')
            index++;
        //after skipping thew whitespaces, check if maybe you have reached the end of the String
        if(index >= n)
            return 0;
        //check for the sign
        if(s.charAt(index) == '+' || s.charAt(index) == '-')
            sign = s.charAt(index++) == '+' ? 1 : -1;

        long result = 0;
        while (index < n && Character.isDigit(s.charAt(index))) {
            result = result * 10 + (s.charAt(index++) - '0');

            //check for overflow
            if(result * sign > Integer.MAX_VALUE || result * sign < Integer.MIN_VALUE) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        }

        return (int) (result * sign);
    }

    public static void main(String[] args) {
        System.out.println("String Integer Value: " + myAtoi("4589 with Melvin"));
    }
}
