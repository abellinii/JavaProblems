package com.company;

//
//Implement strStr().
//
//        Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
//
//        Example 1:
//
//        Input: haystack = "hello", needle = "ll"
//        Output: 2

public class Main {


    public static void main(String[] args) {

        strStr("mississippi", "pi");
    }

    public static int strStr(String haystack, String needle) {
        int N = needle.length();
        int H = haystack.length();

        if(needle.equals("") || needle == null )return 0;   //Edge cases
        if(N > H) return -1;
        if(needle.equals(haystack)) return 0;


        int temp = -1;
        for (int i = 0; i < haystack.length();i++){               //check each char of haystack

            if(haystack.charAt(i) == needle.charAt(0) && (H - i) >= N ){    //if first chars match continue through untill the end of needle
                temp = i;
                for(int j = i, k = 0; k < needle.length(); k++, j++ ){

                    if(haystack.charAt(j) != needle.charAt(k) ){

                        temp = -1;
                        break;                                      //no match then break

                    }

                    if(k + 1 == N) return temp;                     // return match


                }





            }
        }
        return temp;
    }
}
