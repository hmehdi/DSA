package com.company.al.easy;

import java.util.Arrays;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {

        if(nums == null || nums.length ==0 || nums.length==1){
            return;
        }
        int nonZeroPointer =0;
        for (int i =0; i<nums.length; i++){
            if(nums[i] !=0){
                int tmp = nums[i];
                nums[i] = nums[nonZeroPointer];
                nums[nonZeroPointer] = tmp;
                nonZeroPointer++;
            }
        }
    }

    public static void main(String... arg){
//        int[] nums = {0,1,0,3,12}; //Output: [1,3,12,0,0]
        int[] nums = {1,2,0,1,0,3,12}; //Output: [1,3,12,0,0]
        new MoveZeroes().moveZeroes(nums);

        System.out.println(Arrays.toString(nums));
    }
}
