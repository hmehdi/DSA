package com.company.al.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Roman2Number {


    public int romanToInt(String s) {
        // Create a map to store the values of each Roman numeral
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0; // To keep track of the previous value

        // Traverse the string in reverse order
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanValues.get(s.charAt(i));

            // If the current value is less than the previous value, subtract it
            if (currValue < prevValue) {
                result -= currValue;
            }
            // Otherwise, add it to the result
            else {
                result += currValue;
            }

            // Update the previous value
            prevValue = currValue;
        }

        return result;
    }

    public int MyRoman2Int(String s) {

        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            if ( i == s.length()-1){
                String c1 = s.substring(i,i+1);
                arr.add(map.get(c1));
            }else {
                String c1 = s.substring(i, i + 1);
                String c2 = s.substring(i + 1, i + 2);

                if (map.get(c1) < map.get(c2)) {
                    arr.add(map.get(c2) - map.get(c1));
                    i +=1;
                } else {
                    arr.add(map.get(c1));
                }
            }
        }

        int sum = 0;
        for (int n : arr) {
            sum += n;
        }

        return sum;
    }

    public static void main(String[] args) {

        String s = "MCMXCIV";

        System.out.println(new Roman2Number().romanToInt(s));
    }
}
