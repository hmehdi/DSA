package com.company.al.easy;


public class PalindromeNumber {

    public Boolean isPalindrome(int num){

        String s = String.valueOf(num);
        int size = s.length();
        for (int i = 0; i < size -1; i++) {
            int c1 = s.charAt(i);
            int c2 = s.charAt(size - 1 - i);
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int n = 121;

        System.out.println(new PalindromeNumber().isPalindrome(n));
    }


}
