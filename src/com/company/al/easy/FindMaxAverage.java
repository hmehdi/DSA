package com.company.al.easy;

import java.util.ArrayList;

public class FindMaxAverage {

    public float findMaxAverage(int[] nums, int k ){

        float max_avg = 0;
        int lg= nums.length -k +1;
        for (int i =0; i< lg;i++){

            float sum = 0;
            for(int j =i; j< i+k;j++){
                sum+=nums[j];
            }
            float avg = sum/k;
            max_avg = Math.max(avg, max_avg);

        }

        return max_avg;
    }

    public double findMaxAverageBest(int[] nums, int k ){

        if (nums.length==1){
            return nums[0];
        }
        double max_avg = Double.MIN_VALUE;
        double sum=0;
        int start =0;
        for (int i =0; i< nums.length;i++){
            sum += nums[i];

            if ( i >= k - 1){
                double avg = sum/k;

                max_avg =Math.max(avg, max_avg);
                sum -=nums[start];
                start +=1;
            }

        }

        return max_avg;
    }
    public static void main(String... args){
        int[] nums = {1,2,3,5,1,6,5,9};
        int k= 3;

        double result = new FindMaxAverage().findMaxAverageBest(nums,k);

        System.out.println(result);


    }
}
