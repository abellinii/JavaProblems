package com.company;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

//
//The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
//
//        F(0) = 0,   F(1) = 1
//        F(N) = F(N - 1) + F(N - 2), for N > 1.
//        Given N, calculate F(N).

public class Main {


    public static void main(String[] args) {

        int[] memo = new int[6+1];
        climb(0,6,memo);

  }




    public static int climb(int i,int n, int[] memo){
        if(i > n){
            return 0;
        }

        if (i == n){
            return 1;
        }
        if(memo[i] > 0){
            return memo[i];
        }

        memo[i] = climb(i + 1,n, memo) + climb(i + 2, n , memo);
        return memo[i];

    }

    }





