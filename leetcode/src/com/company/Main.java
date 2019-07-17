package com.company;
import java.util.List;
import java.util.ArrayList;

//
//Given a binary tree, return the postorder traversal of its nodes' values.
//
//        Example:
//
//        Input: [1,null,2,3]
//        1
//        \
//        2
//        /
//        3
//
//        Output: [3,2,1]

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

    public static void trav( TreeNode root, List<Integer> list){

        if(root != null){

            trav(root.left,list);
            trav(root.right,list);
            list.add(root.val);
        }


    }

}
