package com.company;


//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
//
//        Example 1:
//
//        Input: 121
//        Output: true


public class Main {

    public static void main(String[] args) {
        // write your code here

        isPalindrome(10);
    }






    public static boolean isPalindrome(int x) {
        int y =0;
        //Check edge cases (negative number || ending with 0)
        if(x < 0 || x % 10 == 0 && x != 0) return false;

        //halve num
        while(x > y){
            y = y * 10 + x % 10;
            x= x/10;

        }

        //check
        if(x == y || x * 10 + y % 10 == y){

            return true;
        }else{

            return false;
        }
    }
}