package com.company.al.medium;

public class LongestOnes {

    public static int longestOnes(int[] nums, int k) {
        int maxOnes = 0;
        int currentOnes = 0;
        int currentZero = 0;
        boolean isWindow=false;

        for(int i =0; i<nums.length-1;i++){
            if(nums[i]==1){
                currentOnes +=1;
                if(isWindow){
                    maxOnes = Math.max(maxOnes,currentOnes+currentZero);
                }
            }else{
                currentZero +=1;
                if(currentZero >k){
                    isWindow =true;
                    maxOnes = Math.max(maxOnes,currentOnes+k);
                    currentZero -=1;
                    currentOnes=0;
                } else {
                    isWindow =false;
                }

            }

        }
        return maxOnes;
    }
    public static int longestOnes2(int[] nums, int k) {
        int left = 0;
        int right = 0;
        int maxOnes = 0;
        int zerosCount = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                zerosCount++;
            }

            while (zerosCount > k) {
                if (nums[left] == 0) {
                    zerosCount--;
                }
                left++;
            }

            maxOnes = Math.max(maxOnes, right - left + 1);
            right++;
        }

        return maxOnes;
    }
    public static void main(String... args){
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0}; // output 6
        int k= 2;

        double result = longestOnes2(nums,k);

        System.out.println(result);


    }
}
