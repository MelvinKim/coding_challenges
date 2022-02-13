package com.company.strings.easy;

import java.util.Arrays;

public class camelCase {
    public static String camelCase(String str) {
        StringBuilder sb = new StringBuilder();

        //convert the string to a string array
        String[] strArray = str.split("[''_-]");

        for (String s : strArray) {
            for (int i=0; i < s.length(); i++) {
                if(i==0) {
                    sb.append((s.charAt(i)+"").toUpperCase());
                } else {
                    sb.append((s.charAt(i) +"").toLowerCase());
                }
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(camelCase("THE-BOY-was_good"));
    }
}
