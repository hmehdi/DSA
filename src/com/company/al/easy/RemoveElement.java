package com.company.al.easy;

public class RemoveElement {
/*

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
 The remaining elements of nums are not important as well as the size of nums.

Return k.

 */

    public int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public int removeElement2(int[] nums,int val) {
        if (nums.length == 0) {
            return 0;
        }

        int i = nums.length;
        for (int j = 0; j < nums.length; j++) {
            int x = nums[j];
            if (x == val) {
                i--;
               //nums[j] = null;
            }
        }

        return i ;
    }

    public static void main(String... args){
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int val = 2;
        int length = new RemoveElement().removeElement(nums,val);

        System.out.println("New length: " + length);
        System.out.print("Array after removing Element ");
        for (int i = 0; i < length; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
