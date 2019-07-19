package com.company;



//
//Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).
//
//        For example, this binary tree [1,2,2,3,4,4,3] is symmetric:
//
//        1
//        / \
//        2   2
//        / \ / \
//        3  4 4  3
//
//
//        But the following [1,2,2,null,3,null,3] is not:
//
//        1
//        / \
//        2   2
//        \   \
//        3    3

public class Main {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(2);
        root.right.right = new TreeNode(2);


        check(root,root);
    }


      public static class TreeNode {         //Node structure
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }



        public static boolean check(TreeNode root,TreeNode root2){
            if(root == null && root2 == null)return true;                    //If null symmetric
            if(root != null && root2 != null && root.val == root2.val){      //If not null and equal recursively go deeper and check again
                return (check(root.left,root2.right) && check(root.right, root2.left)); //If it reaches the end return true
            }
            return false;                                                               //If it fails return false




        }
    }

