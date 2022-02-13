package com.company.strings.easy;

import java.util.HashMap;

public class RomanToInteger {
    public static int romanToInt(String s) {

        //edge case 1
        if(s.length() == 0) return 0;

        int n = s.length();
        //insert the roman numbers and equivalent values into a hashtable
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        //loop from the last element
        int result = map.get(s.charAt(n-1));
        for (int i=n-2; i>= 0; i--) {
            int val1 = map.get(s.charAt(i)); //left val
            int val2 = map.get(s.charAt(i+1));  //right val

            if(val1 < val2) {
                result = result -val1;
            } else {
                result = result + val1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("value: " + romanToInt("XII"));
    }
}
