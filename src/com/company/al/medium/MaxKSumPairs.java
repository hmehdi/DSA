package com.company.al.medium;

import java.util.HashMap;
import java.util.Map;

public class MaxKSumPairs {
    public static int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int num : nums) {
            int x = k-num;
            if (map.containsKey(k - num) && map.get(k - num) > 0) {
                count++;
                map.put(k - num, map.get(k - num) - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,3,4,3};
        int k = 6;
        int out = maxOperations(nums, k);
        System.out.println(out);
    }

}
