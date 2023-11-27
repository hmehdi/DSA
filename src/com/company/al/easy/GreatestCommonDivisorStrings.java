package com.company.al.easy;

public class GreatestCommonDivisorStrings {


    public  String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        // find the length of the greatest common divisor
        int gcdLength = gcd(len1, len2);

        // check if the substrings of length gcdLength are common divisors
        String gcd = str1.substring(0, gcdLength);
        if (checkDivisor(str1, gcd) && checkDivisor(str2, gcd)) {
            return gcd;
        } else {
            return "";
        }
    }

    // helper method to check if a string is a common divisor of another string
    private  boolean checkDivisor(String str, String divisor) {
        int len = str.length() / divisor.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(divisor);
        }
        return sb.toString().equals(str);
    }

    // helper method to find the greatest common divisor of two numbers
    //بزرگ‌ترین مقسوم‌علیه مشترک
    private  int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }


    public static void main(String... args){
      //  String  str1 = "ABCABC", str2 = "ABC"; //Output: "ABC"
        String  str1 = "ABABAB", str2 = "ABAB";// "AB"

        // String  str1 = "LEET", str2 = "CODE";// ""
        String out = new GreatestCommonDivisorStrings().gcdOfStrings(str1,str2);

        System.out.println(out );

    }
}
