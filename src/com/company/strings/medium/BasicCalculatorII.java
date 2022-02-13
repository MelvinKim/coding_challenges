package com.company.strings.medium;

//LeetCode 227. Basic Calculator II

import java.util.Arrays;
import java.util.Stack;

public class BasicCalculatorII {

    public static int calculate(String s) {

        //check the empty String edge case
        if(s == null || s.isEmpty()) return 0;

        int len = s.length();
        Stack<Integer> stack = new Stack<>();

        int currNum = 0;
        char operator = '+';

        for (int i=0; i < len; i++) {

            char currCh = s.charAt(i);

            //check if the current character is a digit
            if(Character.isDigit(currCh)) {
                currNum = (currNum * 10) + (currCh - '0');
            }
            //if it's not a digit --> it's either an operator or some white space --> make sure we are not at the last number
            if(!Character.isDigit(currCh) && !Character.isWhitespace(currCh) || i == len - 1) {
                if(operator == '-') {
                    stack.push(-currNum);
                } else if(operator == '+') {
                    stack.push(currNum);
                } else if(operator == '*') {
                    stack.push(stack.pop() * currNum);
                } else if(operator == '/') {
                    stack.push(stack.pop() / currNum);
                }

                operator = currCh;
                currNum = 0;
            }
        }

        int result = 0;
        while (!stack.empty()) {
            result += stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "3+5/2";
        System.out.println(calculate(s));
    }
}
