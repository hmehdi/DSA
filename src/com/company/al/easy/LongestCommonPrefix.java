package com.company.al.easy;

import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {

            String pr = prefix;
            String tmp = strs[i];
            int xx = strs[i].indexOf(prefix);
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;


    }

    public static void main(String[] args) {

        String[] arr = {"flower", "flow", "flight"};

        System.out.println(new LongestCommonPrefix().longestCommonPrefix(arr));

    }


}
