package com.company.strings.easy;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {

        //since we are dealing with pairs, the string must be of even length
        if(s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if(c == ')' && !stack.empty() && stack.peek() == '(') {
                stack.pop();
            } else if(c == ']' && !stack.empty() && stack.peek() == '[') {
                stack.pop();
            } else if(c == '}' && !stack.empty() && stack.peek() == '{') {
                stack.pop();
            }
            else {
                return false;
            }
        }

        //stack should be empty if string is valid
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println("result: " + isValid("(()())"));
    }
}

