package com.company.al.medium;

import java.util.Arrays;

public class ReverseWords {


    public static String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                word.insert(0, s.charAt(i)); // build the word in reverse order
            } else if (word.length() > 0) {
                if (reversed.length() > 0) {
                    reversed.append(" ");
                }
                reversed.append(word); // append the word to the result
                word.setLength(0); // reset the word StringBuilder
            }
        }

        if (word.length() > 0) {
            if (reversed.length() > 0) {
                reversed.append(" ");
            }
            reversed.append(word); // append the last word to the result
        }

        return reversed.toString();
    }

    public String reverseWords3(String s)
    {
        return Arrays.stream(s.trim().split("\\s+"))
                .reduce((ss, w) -> w + " " + ss)
                .orElse("");
    }

    public static void main(String... args){
        String s ="the sky is blue"; //"blue is sky the"

        String out = new ReverseWords().reverseWords(s);

        System.out.println(out);
    }
}
