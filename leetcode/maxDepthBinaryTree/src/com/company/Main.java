package com.company;



//Given a binary tree, find its maximum depth.
//
//        The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
//
//        Note: A leaf is a node with no children.
//
//        Example:
//
//        Given binary tree [3,9,20,null,null,15,7],
//
//        3
//        / \
//        9  20
//        /  \
//        15   7
//        return its depth = 3.

public class Main {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(2);
        root.right.right = new TreeNode(2);

        maxDepth(root);

    }





        public static int maxDepth(TreeNode root) {
            if (root == null) return 0;                 //Edge case
            else
                return 1 + Math.max(maxDepth(root.left), maxDepth(root.right)); //recursively increment each time the tree goes deeper and return the greater forom left or right
        }


        public static class TreeNode {               //Node structure
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x) { val = x; }
        }



    }

}