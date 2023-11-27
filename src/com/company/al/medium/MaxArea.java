package com.company.al.medium;

public class MaxArea {


    /*
    - getting a bigger area happens when only we move the smaller value between a and b.
     */
    public static int maxArea(int[] height) {

        // time complexity O(N^2)
        // Space Complexity O(1)
        int maxArea = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i+1; j < height.length; j++) {

                int len = Math.min(height[i],height[j]);
                int width = j-1;
                maxArea = Math.max(len*width, maxArea);
            }
        }

        return maxArea;

    }
    public static int maxAreaB(int[] height) {

        // time complexity O(N)
        // Space Complexity O(1)
        if (height == null || height.length < 2) {
            return 0;
        }

        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int minHeight = Math.min(height[left], height[right]);
            int area = minHeight * (right - left);
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;

    }
    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int out = maxAreaB(height);
        System.out.println(out);
    }

}
