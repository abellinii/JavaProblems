package com.company;
import java.util.Stack;



public class Main {

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(arr);
    }

    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;              //keep track of max sub array
        int best = 0;                             //keep track of current value

        for (int i = 0; i < nums.length; i++) {
            best += nums[i];                      //add each num to best
            if (best > max) {                     //If highest so far keep track
                max = best;
            }
            if (best < 0) {                       //less than 0 set to 0
                best = 0;
            }
        }
        return max;
    }


}
