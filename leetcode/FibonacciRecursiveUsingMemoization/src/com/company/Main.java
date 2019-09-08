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

        fib(30);


    }


    //Use a map to keep track of calculated values
    public static HashMap<Integer,Integer> cache = new HashMap<Integer,Integer>();

    public static int fib(int n) {
        int result;
        //If value exists grab
        if(cache.containsKey(n)){
            return cache.get(n);
        }

        //Otherwise calculate value
        if(n < 2 ){
            result = n;
        }else{
            result = fib(n-1) + fib(n-2);
        }

        //Store latest calculation
        cache.put(n,result);
        return result;

    }

}

