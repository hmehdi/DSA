package com.company.interview;



/*
    I have an Integer array where every number appears even number of time except one. Find that number
*/
public class OddNumberProblem {
    private int[] array = {1,2,1,2};//,3,4,5,2,3,4};
    public int findSingleOdd(){
        int result =0;
        for (int i : array) {
            System.out.println("i= "+ i);
            result=result^i;
            System.out.println("result= "+ result);
        }
        return result;
    }
    public static void main(String[] args) {
        OddNumberProblem test = new OddNumberProblem();
        int singleOdd = test.findSingleOdd();
        System.out.println("singleOdd = " + singleOdd);
    }
}
