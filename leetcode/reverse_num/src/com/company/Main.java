package com.company;
import java.sql.SQLOutput;
import java.util.Map;
import java.util.HashMap;



//Given a 32-bit signed integer, reverse digits of an integer.
//
//        Example 1:
//
//        Input: 123
//        Output: 321




public class Main {

    public static void main(String[] args) {

        reverse(1534236469);


    }


    public static int reverse(int x) {

        long rev = 0;
        int pop = 0;
        while(x != 0){
            //add last digit
            pop = x % 10;
            //shrink num by factor of 10
            x = x/10;
            //gor rev by factor of 10
             rev = rev * 10 + pop;

            //Check if num is larger than  min/max int size


        }

        if(rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE){

            System.out.println("Error: number is too large");

            return 0;

        }else {

            System.out.println("Reversed number is :" + rev);

            return (int)rev;


        }

    }

}

