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
        TreeNode root = new TreeNode(1);            //populate tree;
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> l1 = new ArrayList<>();
        l1.add(root.val);
        list.add(l1);
        trav(root,list);



    }

    public static class TreeNode {         //Create node structure
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }


    }

    public static void trav (TreeNode root,List<List<Integer>> list){

        if(root.right != null || root.left != null){
            List<Integer> l2 = new ArrayList<>();
            if(root.left != null)l2.add(root.left.val);
            if(root.right != null)l2.add(root.right.val);
            list.add(l2);
            if(root.right != null)trav(root.right,list);

            if(root.left != null)trav(root.left,list);
        }
    }

}
