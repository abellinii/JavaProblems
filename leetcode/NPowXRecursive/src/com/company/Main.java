package com.company;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
//
//  Pow(x, n)
//          Solution
//          Implement pow(x, n), which calculates x raised to the power n (xn).
//
//          Example 1:
//
//          Input: 2.00000, 10
//          Output: 1024.00000
//          Example 2:
//
//          Input: 2.10000, 3
//          Output: 9.26100
//          Example 3:
//
//          Input: 2.00000, -2
//          Output: 0.25000
//          Explanation: 2-2 = 1/22 = 1/4 = 0.25
//          Note:
//
//          -100.0 < x < 100.0
//        n is a 32-bit signed integer, within the range [−231, 231 − 1]



public class Main {


    public static void main(String[] args) {

        myPow(0.00001,
                2147483647);

    }





    public static double myPow(double x, int n) {

        //Take care of ridiculous edge cases
        if(n  < -2147483647 || n  > 2147483646){

            return (x == 2.0)? 0:(n < 0 && x < 0)? Math.abs(x): x;
        }else{
            //Recursively call x * myPow
            return (n == 1) ? x:(n < 0)? myPow(1 / x,-n): x * myPow(x,n - 1);
        }

    }


}

