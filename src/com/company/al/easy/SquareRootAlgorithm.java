package com.company.al.easy;

public class SquareRootAlgorithm {

    public static int sqrt(int x) {
        if (x == 0) {
            return 0;
        }

        int left = 1;
        int right = x;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            if (mid <= x / mid && (mid + 1) > x / (mid + 1)) {
                return mid;
            } else if (mid > x / mid) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1; // Return -1 if no square root is found (shouldn't happen)
    }


    // Babylonian Method
    public static int sqrtB(int x){
        if (x<=1){
            return x;
        }

        float mid = x/2;
        float change = 1;
        while (change > 0.1){
            float next_x = (float) (0.5 * (mid + x/mid));
            change = Math.abs(mid - next_x);
            mid = next_x;
        }

        int x_n1 = (int) mid;
        return  x_n1;

    }
    public static void main(String[] args) {
        int x = 4;
        int result = sqrtB(x);
        System.out.println("Square root of " + x + " is: " + result);
    }
}
