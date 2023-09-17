package com.company.al;

import java.util.Collections;
import java.util.Map;

public class twoSum {

    public static void main(String[] args) {

        int[] arr = {8,5,2,10};
        int target = 10;
        String res = twoSumNumber2(arr,target);
        System.out.println(res);

    }


    // this best method to found O(n)
    private static String twoSumNumber2(int[] numbs, int target){

        Map<Integer,Integer> dic = new java.util.HashMap<>(Collections.emptyMap());
        for (int i = 0; i < numbs.length ; i++){
            if (dic.containsKey(target - numbs[i])){
                return " i ="+i + ", j = " + dic.get(target - numbs[i]);
            }else {
                dic.put(numbs[i],i);
            }
        }

        return "no";
    }

    // O(n^2)
    private static String twoSumNumber(int[] numbs, int target){

        for (int i = 0 ; i < numbs.length; i++){
            for (int j= 1; j < numbs.length;j++){
                if (numbs[i] + numbs[j] == target){
                    return "i = " + i +",j= " +j;
                }
            }
        }

        return "not found";
    }
}
