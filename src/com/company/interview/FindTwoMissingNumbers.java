package com.company.interview;
public class FindTwoMissingNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 5, 6, 8}; // Example array with two missing numbers
        int n = nums.length + 2; // Expected length of the array (1 to n)

        long totalSum = n * (n + 1) / 2; // Sum of the first n natural numbers
        long totalSumOfSquares = n * (n + 1) * (2 * n + 1) / 6; // Sum of squares of the first n natural numbers

        long actualSum = 0;
        long actualSumOfSquares = 0;

        for (int num : nums) {
            actualSum += num;
            actualSumOfSquares += (long) num * num;
        }

        // Calculate the sum and sum of squares of missing numbers
        long sumOfMissing = totalSum - actualSum;
        long sumOfSquaresOfMissing = totalSumOfSquares - actualSumOfSquares;

        // Solve for the two missing numbers using a system of equations
        // x + y = sumOfMissing
        // x^2 + y^2 = sumOfSquaresOfMissing

        // Calculate one of the missing numbers (x or y) using the first equation
        long x = (sumOfMissing + (long) Math.sqrt(2 * sumOfSquaresOfMissing - sumOfMissing * sumOfMissing)) / 2;

        // Calculate the other missing number (y) using the value of x
        long y = sumOfMissing - x;

        System.out.println("The missing numbers are: " + x + " and " + y);
    }
}
