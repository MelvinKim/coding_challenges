package com.company.strings.easy;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class firstUniqueCharacter {
    public static int firstUniqueChar(String s) {
        char answer = 0;

        HashMap<Character, Integer> hashtable = new HashMap<>();

        for (int i=0; i < s.length(); i++) {
            if(hashtable.containsKey(s.charAt(i))) {
                hashtable.put(s.charAt(i), hashtable.get(s.charAt(i)) + 1);
            } else {
                hashtable.put(s.charAt(i), 1);
            }
        }

        //loop over the hashtable and return the first char that has a value 1
        for (Map.Entry<Character, Integer> entity : hashtable.entrySet()) {
            if(entity.getValue() == 1) {
                answer = entity.getKey();
                break;
            }
        }
        System.out.println("answer: " + answer);


        //check the index of that char
        for (int i=0; i < s.length(); i++) {
            if(s.charAt(i) == answer) {
                return i;
            }
        }


        //remember to change
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Index of First Unique char: " + firstUniqueChar("loveleetcode"));
    }
}
