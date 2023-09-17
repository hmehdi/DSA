package com.company.interview;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 6, 3, 7, 8}; // Example array
        int n = nums.length + 1; // Expected length of the array (1 to n)

        int expectedSum = (n * (n + 1)) / 2; // Sum of the first n natural numbers
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        int missingNumber = expectedSum - actualSum;
        System.out.println("The missing number is: " + missingNumber);
    }
}

