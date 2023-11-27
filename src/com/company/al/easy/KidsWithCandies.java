package com.company.al.easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;

        // Find the maximum number of candies
        for (int candy : candies) {
            maxCandies = Math.max(maxCandies, candy);
        }

        // Check if each kid can have the greatest number of candies
        for (int candy : candies) {
            if (candy + extraCandies >= maxCandies) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }


    public static void main(String... args){

//        int[] candies = {2,3,5,1,3}; //[true,true,true,false,true]
//        int extraCandies = 3;

//        int[]candies = {4,2,1,1,2}; //[true,false,false,false,false]
//        int extraCandies = 1;

        int[] candies = {12,1,12};//[true,false,true]
        int extraCandies = 10;
        List<Boolean> out = new KidsWithCandies().kidsWithCandies(candies,extraCandies);

        System.out.println(out);
    }
}
