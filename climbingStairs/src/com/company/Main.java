package com.company;
import java.util.List;
import java.util.ArrayList;


//
//You are climbing a stair case. It takes n steps to reach to the top.
//
//        Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//
//        Note: Given n will be a positive integer.
//
//        Example 1:
//
//        Input: 2
//        Output: 2
//        Explanation: There are two ways to climb to the top.
//        1. 1 step + 1 step
//        2. 2 steps


public class Main {


    public static void main(String[] args) {
        int n = 54;

        climbStairs(n);



    }

    public static int climbStairs(int n) {
        int[] cache = new int[3];   //keep track of sum of 1,2
        if (n == 1) {               //Edge case
            return 1;
        } else if (n == 2) {        //Edge case
            return 2;
        } else {
            cache[0] = 1;           //Set initial nums
            cache[1] = 2;
            for (int i = 2; i < n; i++) {        //loop through possibilities
                cache[2] = cache[0] + cache[1];  //add the two then swap
                cache[0] = cache[1];
                cache[1] = cache[2];
            }
        }
        return cache[2];
    }

}

