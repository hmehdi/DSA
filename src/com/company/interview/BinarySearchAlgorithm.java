package com.company.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;

public class BinarySearchAlgorithm {

    public static void main(String[] args) {
        List<Integer> sortedArray  = new ArrayList<>(asList(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));
       // List<Integer> arr = Arrays.asList(1,2,3);
        int key = 13;
        int result = BSA(sortedArray, key);
        System.out.println(result);
    }

    private static int BSA(List<Integer> sortedArray, int key) {
        int low=0;
        int high = sortedArray.size() -1 ;
        while (low <= high){
            int mid = (low+ high)>>>1;
            Comparable<? super Integer> midVal  = sortedArray.get(mid);
            int cmp = midVal.compareTo(key);

            if (cmp<0)
                low = mid+1;
            else if (cmp > 0)
                high = mid -1;
            else
                return mid;
        }
        return - (low +1);
    }
}
