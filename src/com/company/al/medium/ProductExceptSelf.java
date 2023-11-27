package com.company.al.medium;

import java.util.Arrays;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int numsLength = nums.length;
        int prefixProduct = 1;

        int[] result = new int[numsLength];
        // Calculate left
        for(int i = 0; i < numsLength; i++) {
            result[i] = prefixProduct;
            prefixProduct *= nums[i];
        }

        // Calculate right
        int suffixProduct = 1;
        for(int i = numsLength-1; i >= 0; i--) {
            result[i] *= suffixProduct;
            suffixProduct *= nums[i];
        }
        return result;
    }

    public static void main(String... args){
        int[] nums = {1,2,3,4};

        int[] out = new ProductExceptSelf().productExceptSelf(nums);

        System.out.println(Arrays.toString(out));
    }


}
