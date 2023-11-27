package com.company.al.easy;

public class MergeAlternately {

    public String mergeAlternately(String word1, String word2) {

        int i = 0;
        int j = 0;

        StringBuilder mrg = new StringBuilder();

        while (i < word1.length() || j < word2.length()) {

            if (i < word1.length()) {
                mrg.append(word1.charAt(i));
                i++;
            }
            if (j < word2.length()) {
                mrg.append(word2.charAt(j));
                j++;
            }
        }

        return mrg.toString();
    }

    public static void main(String... args) {
        //String word1 = "abc", word2 = "pqr"; //Output: "apbqcr"

        // String word1 = "ab", word2 = "pqrs"; //Output: "apbqrs"

        String word1 = "abcd", word2 = "pq"; //"apbqcd"

        String out = new MergeAlternately().mergeAlternately(word1, word2);
        System.out.println(out);


    }
}
