package com.company.al.easy;

import com.company.al.model.TreeNode;

public class PathSumTreeNode {

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null){
            return false;
        }
        // If we reach a leaf node and the remaining target sum is equal to the leaf node's value, return true
        if (root.left == null && root.right == null && targetSum - root.val == 0) {
            return true;
        }
        // Recursively check if there is a path with the remaining target sum in the left or right subtree
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    public static void main(String... args){

        // root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
        TreeNode root = new TreeNode(5);
        root.left =  new TreeNode(4);
        root.right =  new TreeNode(8);

        root.left.left =  new TreeNode(11);
        root.left.left.left =  new TreeNode(7);
        root.left.left.right =  new TreeNode(2);

        root.right.left =  new TreeNode(13);
        root.right.right =  new TreeNode(4);
        root.right.right.right =  new TreeNode(1);

        int targetSum = 22;
        PathSumTreeNode pathSum = new PathSumTreeNode();
        boolean hasPath = pathSum.hasPathSum(root, targetSum);

        System.out.println(hasPath);
    }
}
