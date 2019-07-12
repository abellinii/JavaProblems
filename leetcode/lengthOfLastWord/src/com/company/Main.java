package com.company;
import java.util.Stack;



public class Main {


//
//    Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
//
//    If the last word does not exist, return 0.
//
//    Note: A word is defined as a character sequence consists of non-space characters only.
//
//            Example:
//
//    Input: "Hello World"
//    Output: 5

    public static void main(String[] args) {
        lengthOfLastWord("      ");
    }


    public static int lengthOfLastWord(String s) {
        int res = 0;                              //set result
        boolean flag = false;                     //set flag for when a word is found
        for (int i = s.length() - 1; i >= 0; i--) {   //Iterate and count once a word is found
            if (s.charAt(i) != ' ') {
                flag = true;
                res++;
            }
            else if (flag == true) break;             //once you have the length return
        }
        return res;
    }



}
