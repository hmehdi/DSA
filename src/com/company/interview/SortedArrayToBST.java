package com.company.interview;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedArrayToBST {

    static class Node{
        Node left;
        Node right;
        int data;
        boolean isLeaf() {
            return left == null ? right == null : false;
        }
        public static int height(Node node){
            if(node == null){
                return 0;
            }
            int hLeft = height(node.left);
            int hRight = height(node.right);
            int height = 1+Math.max(hLeft, hRight);
            return height;
        }
    }

    Node sortedArrayToBST(int arr[],int n){
        return sortedArrayToBST(arr,0,n-1);
    }

    Node sortedArrayToBST(int arr[], int start, int end) {
        if (start > end) return null;
        int mid = start + (end - start) / 2; // same as (start+end)/2, but it avoids overflow.
        Node node = new Node();
        node.data = arr[mid];
        node.left = sortedArrayToBST(arr, start, mid - 1);
        node.right = sortedArrayToBST(arr, mid + 1, end);
        return node;
    }

    public static void main(String[] args) {
//        int[] sortedArray = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//        SortedArrayToBST test = new SortedArrayToBST();
//        Node node = test.sortedArrayToBST(sortedArray, 11);
//        System.out.println(node.data);

        int a  = 10;
        int b  = 20;

        a ^=b;
        b ^=a;
        a ^=b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }


}
