package com.company;
import java.util.Stack;


//
//Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
//
//        The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
//
//        You may assume the integer does not contain any leading zero, except the number 0 itself.
//
//        Example 1:
//
//        Input: [1,2,3]
//        Output: [1,2,4]
//        Explanation: The array represents the integer 123.



public class Main {


    public static void main(String[] args) {
        int[] arr = {8,3,8,4,7,2,5,8,9};

        plusOne(arr);
    }

    public static int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        boolean flag = true;

        for (int k = i; k >= 0; k--) {  //If there is a need to add a extra int
            if (digits[k] != 9) {
                flag = false;
            }
        }

        if (flag) {
            return carry(digits); //Operate carry function
        } else {
            if (digits[i] != 9) {          //Only one number to increment then rdo and return
                digits[i] = digits[i] + 1;
                return digits;
            } else {
                while (digits[i] == 9 && i != 0) {       //Otherwise continue carrying until done and return

                    if(digits[i - 1] == 9){

                        digits[i - 1] =    9;
                        digits[i] = 0;

                    }else {
                        digits[i - 1] =  digits[i - 1] + 1;
                        digits[i] = 0;
                        break;
                    }

                    i--;


                }


            }
        }
        return digits;
    }







    public static int[] carry(int[] oldDigs){
        int j = oldDigs.length;
        int[] newDigs = new int[oldDigs.length +1];
        if(j==0){

            newDigs[j + 1] = 0;
            newDigs[j] = 1;

        }else {

            while (j > 0) {


                newDigs[j - 1] = 1;
                newDigs[j] = 0;
                oldDigs[j-1] = 0;
                j--;

            }
        }
        return newDigs;
    }

}
