package com.company.al.easy;

public class FindIndexFirstOccurrence {

    public int strStr2(String haystack, String needle) {

        if (needle.length()> haystack.length()){
            return -1;
        }
        if (needle.equals(haystack)) return 0;


        int idx =-1;
        int winS= needle.length();
        for (int i =0; i<=haystack.length() - needle.length();i++){
            if(haystack.substring(i, i + winS).equals(needle)) {
                return i;
            }
        }
        return idx;
    }
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        int nIndex = 0;
        for(int i=0; i<hLen; i++){
            // as long as the characters are equal, increment needleIndex
            if(haystack.charAt(i)==needle.charAt(nIndex)){
                nIndex++;
            }
            else{
                // start from the next index of previous start index
                i=i-nIndex;
                // needle should start from index 0
                nIndex=0;
            }
            // check if needleIndex reached needle length
            if(nIndex==nLen){
                // return the first index
                return i-nLen+1;
            }
        }
        return -1;
    }
    public static void main(String... args){

       String haystack = "sadbutsad", needle = "sad";
      // String haystack = "leetcode", needle = "leeto";

        System.out.println(new FindIndexFirstOccurrence().strStr(haystack,needle));
    }
}
