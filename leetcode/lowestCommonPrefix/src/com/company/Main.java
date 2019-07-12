package com.company;


//
//Write a function to find the longest common prefix string amongst an array of strings.
//
//        If there is no common prefix, return an empty string "".
//
//        Example 1:
//
//        Input: ["flower","flow","flight"]
//        Output: "fl"

public class Main {

    public static void main(String[] args) {

            String arr[] = {"hello", "hel","to","catch"};

            longestCommonPrefix(arr);
    }

    public static String longestCommonPrefix(String[] strs) {

        if(strs.length == 0)return "";            //Check arr is not empty
        String chs = strs[0];                     //Set first strig as comparison string
        int LCP = chs.length();                   //Set highest possible value

        for( int i = 1; i < strs.length; i++){
            int curr = 0;                         //Intialise current string starting point
            if(LCP > strs[i].length()){           //LCP can only be as large as current string
                LCP = strs[i].length();
            }
            for(int j = 0; j < LCP; j++){        //Starting from first char check until failure

                if(strs[i].charAt(j) == chs.charAt(j)){   //Compare

                    curr++;                               //True: add and continue
                }else{

                    if(curr < LCP){                       //True: set new LCP

                        LCP = curr;
                    }else if(LCP == 0){                   //True: return no LCP
                        return "";
                    }

                    break;                                //False : move to next string
                }

            }


        }
        return strs[0].substring(0,LCP);
    }
}
