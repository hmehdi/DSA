package com.company.al.medium;

public class IncreasingTripletSubsequence {

    /*
        Given an integer array nums, return true if there exists a triple of indices (i, j, k)
         such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

Example 1:

Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.
Example 2:

Input: nums = [5,4,3,2,1]
Output: false
Explanation: No triplet exists.
Example 3:

Input: nums = [2,1,5,0,4,6]
Output: true
Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.

Algorithm:
1) Initialize the smallest and second-smallest element to infinity.
2) For each element in the array:
     a. If the element is less than the smallest element, update the smallest element.
     b. If the element is greater than the smallest element but less than the second smallest element, update the second smallest element.
     c. If the element is greater than both the smallest and second smallest element, we have found our triplet and return true.
3) If we have not found any triplet, return false.

    */

    public boolean increasingTriplet(int[] nums) {
        int small = Integer.MAX_VALUE;
        int big = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= small) {
                small = num;
            } else if (num <= big) {
                big = num;
            } else {
                return true;
            }
        }
        return false;

    }


    public static void main(String... arg){

       // int[] nums ={1,2,3,4,5}; //true
     //   int[] nums ={2,1,5,0,4,6};
       // int[] nums ={20,100,10,12,5,13};
        int[] nums ={5,4,3,2,1};

        Boolean result = new IncreasingTripletSubsequence().increasingTriplet(nums);

        System.out.println(result);
    }
}
