package com.company.al;

public class rotateArray {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        rotate(a,3);
    }

    // array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4]
    public static void rotateArr(int[] arr, int k) {

        int[] b = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int idx = i + k;
            if (i + k >= arr.length) {
                idx = (i + k - arr.length);
            }
            int item = arr[i];
            b[idx] = item;
        }
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);

        }
    }

    public static void rotate2(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
    }

    public static int[] rotate(int[] nums, int k) {
        if (k > nums.length)
            k = k % nums.length;

        int[] result = new int[nums.length];
        for (int i = 0; i < k; i++) {
            result[i] = nums[nums.length - k + i];
        }
        int j = 0;
        for (int i = k; i < nums.length; i++) {
            result[i] = nums[j];
            j++;
        }

        System.arraycopy(result, 0, nums, 0, nums.length);

        return nums;

    }


    public static void rotateReversal(int[] arr, int order) {

        /*
            {1,2,3,4,5,6}
            1. Divide the array two parts: 1,2,3,4 and 5, 6
            2. Rotate first part: 4,3,2,1,5,6
            3. Rotate second part: 4,3,2,1,6,5
            4. Rotate the whole array: 5,6,1,2,3,4
         */

        order = order % arr.length;
        if (arr == null || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }
        //length of first part
        int a = arr.length - order;
        reverse(arr, 0, a - 1);
        reverse(arr, a, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    public static void reverse(int[] arr, int left, int right) {
        if (arr == null || arr.length == 1)
            return;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}
