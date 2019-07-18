package com.company;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


//Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
//
//        For example:
//        Given binary tree [3,9,20,null,null,15,7],
//        3
//        / \
//        9  20
//        /  \
//        15   7
//        return its level order traversal as:
//        [
//        [3],
//        [9,20],
//        [15,7]
//        ]






public class Main {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> list = new ArrayList<>();        //List to store and return
        Queue<TreeNode> l1 = new LinkedList<>();                //Level list
        if(root == null) return list;                           //Edge case

        trav(root,l1,list);

        return list;

    }




      public class TreeNode {               //Node structure
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
  }





    public void trav (TreeNode root,Queue<TreeNode> l1, List<List<Integer>> list){

        int level = 1;                                    //keep track of nodes in level stored in queue
        TreeNode now = root;                                //set current node as root
        l1.add(now);                                            //Add root
        List<Integer> l2 = new ArrayList<>();


        while(!l1.isEmpty()){                            //While queue is not empty
            now = l1.poll();                                //set current node to top of queue and remove
            l2.add(now.val);                                    //Add value to level list
            level--;                                                //Then decrement level count



            if(now.left != null)l1.add(now.left);
            if(now.right != null)l1.add(now.right);

            if(level == 0){                                         //If done with level set temp and add to full list
                List<Integer> l3 = new ArrayList<>(l2);
                list.add(l3);

                l2.clear();                                         //Clear level list
                level = l1.size();

            }


        }


    }






}
}
