package com.company.al.medium;

import com.company.al.easy.FindMaxAverage;

/*
1456. Maximum Number of Vowels in a Substring of Given Length


Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.
Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.

 */
public class MaxVowels {

    public static int maxVowels(String s, int k) {

        int maxVowels = 0;
        int currentVowels = 0;

        // Count vowels in the first window of length k
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
        }
        maxVowels = currentVowels;

        // Slide the window and update maxVowels
        for (int i = k; i < s.length(); i++) {
            int x = i - k;
            Character c = s.charAt(x);
            if (isVowel(s.charAt(i - k))) {
                currentVowels--;
            }
            if (isVowel(s.charAt(i))) {
                currentVowels++;
            }
            maxVowels = Math.max(maxVowels, currentVowels);
        }

        return maxVowels;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String... args){
        String s = "abciiidef";
        int k= 3;

        double result = maxVowels(s,k);

        System.out.println(result);


    }
}
