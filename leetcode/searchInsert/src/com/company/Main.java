package com.company;

public class Main {

    public static void main(String[] args) {

        int[] nums = {3,4,5,6,7};

	    searchInsert(nums,8);


    }

    public static int searchInsert(int[] nums, int target) {

        for(int i = 0; i <= nums.length - 1; i++){   //search arr until found or otherwise at position and return

            if(target <= nums[i]){

                return i;
            }
        }

        return nums.length; //If not in arr, num is larger so return length
    }

}
