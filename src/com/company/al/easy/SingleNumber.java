package com.company.al.easy;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        if (nums.length<=0){
            return -1;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0; i<nums.length;i++){
            Integer x = nums[i];
            Integer e = map.get(x);
            if(map.get(x) == null){
                map.put(nums[i],1);
            }else{
                map.remove(nums[i]);
            }
        }
        return map.keySet().stream().findFirst().orElse(-1);
    }


    /*

XOR (exclusive OR) is a logical operator that takes two binary digits
as input and returns 1 if exactly one of the digits is 1, and 0 otherwise.
In other words, it returns true if the two bits are different.


Here's a truth table for XOR:

 Input A | Input B | Output
---------------------------
   0    |    0    |   0
   0    |    1    |   1
   1    |    0    |   1
   1    |    1    |   0

when we XOR all the elements in the array, the elements that appear twice will cancel out, and the remaining element will be the single number.

     */
    public static int findSingleNumber(int[] nums) {
        int result = 0;

        // XOR all the elements in the array
        for (int num : nums) {
            result ^= num;
        }

        return result;
    }


    public static void main(String... args){
        int[] arr = {4,1,2,1,2};
        int out = singleNumber(arr);
        int out2 = findSingleNumber(arr);
        int rr = 1 ^ 2 ^ 3 ^ 4 ^ 2 ^ 3 ^ 1;

//        int a = 5; // binary: 0101
//        int b = 5; // binary: 0101
//        int result = a ^ b; // binary: 0000 (0 in decimal)

        int a = 5; // binary: 0101
        int b = 3; // binary: 0011
        int result = a ^ b; // binary: 0110 (6 in decimal)

        System.out.println(out+","+out2);
    }
}
