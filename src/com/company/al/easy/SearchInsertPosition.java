package com.company.al.easy;

public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                return i;
            }
            if(target<nums[i]){
                return i;
            }

        }

        if (target> nums[nums.length-1]){
            return nums.length;
        }
        return -1;
    }
    /*
    Approach
          To solve this problem, I employ the binary search algorithm.
          Binary search provides an efficient way to locate or insert a target value within a sorted array.
          Below is an explanation with steps:

     */
    public int searchInsertB(int[] nums, int target) {
        int left = 0 ;
        int right = nums.length-1;
        while (left<=right){
            int mid  = left + (right-left)/2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
    public static void main(String... args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println(new SearchInsertPosition().searchInsertB(nums,target));
    }

}
