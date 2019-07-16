package com.company;
import java.util.List;
import java.util.ArrayList;


//
//  Binary Tree Preorder Traversal
//
//          Given a binary tree, return the preorder traversal of its nodes' values.
//
//          Example:
//
//          Input: [1,null,2,3]
//          1
//          \
//          2
//          /
//          3
//
//          Output: [1,2,3]



public class Main {


    public static void main(String[] args) {
        List<Integer> keepTrack = new ArrayList<>();    //keep track and make data structure to return;
        TreeNode home = new TreeNode(1);            //populate tree;
        home.left = new TreeNode(2);
        home.left.left = new TreeNode(4);
        home.left.right = new TreeNode(5);

        home.right = new TreeNode(3);
        home.right.left = new TreeNode(6);
        home.right.right = new TreeNode(7);

        trav(home, keepTrack);



    }

      public static class TreeNode {         //Create node structure
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }


  }

    public static void trav(TreeNode root, List<Integer> vals){      // recursive function
        if(root != null){                                             // If not null add value then run function again on right, then left
            vals.add(root.val);                                        // Use right first because of the LIFO nature of recursion
            trav(root.right, vals);
            trav(root.left, vals);

        }

    }

}


