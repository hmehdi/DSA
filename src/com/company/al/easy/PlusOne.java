package com.company.al.easy;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {

        int n = digits.length;
       for(int i= digits.length-1;i>=0;i--){
           if(digits[i]<9){
               digits[i]= digits[i]+1;
               return digits;
           }
             digits[i]=0;

       }
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main (String... args){
        int[] digits = {9,9};

        System.out.println(Arrays.toString(new PlusOne().plusOne(digits)));

    }
}
