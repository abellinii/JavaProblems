package com.company;


//
//Given a binary tree and a sum, determine if the tree has a root-to-leaf path such that adding up all the values along the path equals the given sum.
//
//        Note: A leaf is a node with no children.
//
//        Example:
//
//        Given the below binary tree and sum = 22,
//
//        5
//        / \
//        4   8
//        /   / \
//        11  13  4
//        /  \      \
//        7    2      1
//        return true, as there exist a root-to-leaf path 5->4->11->2 which sum is 22.

public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(2);
        root.right.right = new TreeNode(2);
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        int i = 0;

        return getSum(root,sum,i);
    }


    public boolean getSum(TreeNode root,int sum, int i){
        if(root == null)return false;                               //Edge case
        i += root.val;                                               //Keep track of value at present


        if(root.right == null && root.left == null && i == sum)return true;  //If both children are null and the present value is equal with target value we have a match

        return (getSum(root.right,sum,i) || getSum(root.left,sum,i));  //If not go deeper until the final leaf

    }

    public static class TreeNode {               //Node structure
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

}
