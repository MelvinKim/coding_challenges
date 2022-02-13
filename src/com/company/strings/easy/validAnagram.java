package com.company.strings.easy;

import java.util.Arrays;
import java.util.HashMap;

public class validAnagram {
    public static boolean isAnagram(String s, String t) {

        HashMap<Character, Integer> map_1 = new HashMap<>();
        HashMap<Character, Integer> map_2 = new HashMap<>();

        //populate String 1 into the HashMap
        for (int i=0; i < s.length(); i++) {
            if(map_1.containsKey(s.charAt(i))) {
                map_1.put(s.charAt(i), map_1.get(s.charAt(i)) + 1);
            } else {
                map_1.put(s.charAt(i), 1);
            }
        }

        //populate String 2 into the HashMap
        for (int k=0; k < t.length(); k++) {
            if(map_2.containsKey(t.charAt(k))) {
                map_2.put(t.charAt(k), map_2.get(t.charAt(k)) + 1);
            } else {
                map_2.put(t.charAt(k), 1);
            }
        }

        if(map_1.equals(map_2)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("rat", "car"));
    }
}
