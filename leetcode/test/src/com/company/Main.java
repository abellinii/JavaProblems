package com.company;
import java.util.Stack;

//
//Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
//
//        Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
//
//        Example 1:
//
//        Input: 4
//        Output: 2

public class Main {


    public static void main(String[] args) {
        int a =400;


        mySqrt(a);
    }




    public static int mySqrt(int x) {
        int lo = 1, hi = x;                    //set a high and low num to dynamically check
        while(lo < hi) {                      //while not equal
            int mid = lo + (hi - lo) / 2 + 1; //set the mid point to disregard half the nums
            if(mid > x / mid) {               //reset the mid point
                hi = mid - 1;
            } else {
                lo = mid;
            }
        }
        return hi;                            //When the same return
    }

}

//
