package com.company.al.easy;

public class ReverseVowels {

/*
    345. Reverse Vowels of a String

    Given a string s, reverse only all the vowels in the string and return it.

    The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 */

    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int j=s.length()-1;
        int len = s.length()-1;

        for (int i = 0; i < len; i++) {

            if(isVowel(arr[i])){

                while (j>=0){
                    char sho = arr[j];
                    if(isVowel(arr[j])){
                        char tmp = arr[i];
                        arr[i]=arr[j];
                        arr[j]=tmp;
                        j--;
                        len--;
                        break;
                    }
                    j--;
                    len--;
                }
            }
        }

        return String.valueOf(arr);
    }

    private boolean isVowel(char v){
        return v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u' || v == 'A' ||
                v == 'E' || v == 'I' || v == 'O' || v == 'U';
    }


    public static void main(String... args){
        String s = "hello"; //"holle"
        //String s = "leetcode"; //"leotcede"
        String out = new ReverseVowels().reverseVowels(s);

        System.out.println(out);
    }
}
