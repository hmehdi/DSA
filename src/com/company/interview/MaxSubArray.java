package com.company.interview;

public class MaxSubArray {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);
        System.out.println(result);  // Output: 6 (The maximum subarray is [4, -1, 2, 1], which sums up to 6)
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];  // Initialize the maximum sum to the first element
        int currentSum = nums[0];  // Initialize the current sum to the first element

        for (int i = 1; i < nums.length; i++) {
            // Update the current sum by either continuing the current subarray or starting a new one
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            // Update the maximum sum if the current sum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

}
