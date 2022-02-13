package com.company.strings.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithAtLeastKRepeatingCharacters {
    public static int longestSubstring(String s, int k) {

        int n = s.length();

        //base case 1
        if(n == 0 || s == null || k > n)  return 0;

        //base case 2
        if(k <= 1) return n;

        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if(map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        int l = 0;
        while (l < n && map.get(s.charAt(l)) >= k) {
            l++;
        }
        //the case where we have reached the end
        if(l >= n - 1) return l;

        //now check the two substrings you have created
        int lengthOfSubstring1 = longestSubstring(s.substring(0, l), k);
        while (l < n && map.get(s.charAt(l)) < k) l++;
        int lengthOfSubstring2 = (l < n ) ? longestSubstring(s.substring(l), k) : 0;
        return Math.max(lengthOfSubstring1, lengthOfSubstring2);

    }

    public static void main(String[] args) {
        System.out.println("Length: " + longestSubstring("aaabcb", 2));
    }
}
