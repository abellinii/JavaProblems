package com.company;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


//Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
//
//
//        In Pascal's triangle, each number is the sum of the two numbers directly above it.
//
//        Example:
//
//        Input: 5
//        Output:
//        [
//        [1],
//        [1,1],
//        [1,2,1],
//        [1,3,3,1],
//        [1,4,6,4,1]
//        ]

public class Main {


    public static void main(String[] args) {

        int numRows = 5;

        generate(5);

    }



    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList();
        if(numRows == 0) return res;
        pascal(0, 0, numRows, res);

        return res;
    }


    public static void pascal(int n1, int n2,int numRows, List<List<Integer>> res){


        if(n1 == 0){
            n1++;
            res.add(new ArrayList<Integer>(Arrays.asList(1)));
        }else if(n1 == 1){
            n1++;
            res.add(new ArrayList<Integer>(Arrays.asList(1,1)));

        }else{
            List t =new ArrayList<Integer>();
            t.add(1);
            for(int i = 0; i < (res.get(res.size() -1).size() -1); i++){
                t.add(res.get(res.size() -1).get(i) + res.get(res.size() -1).get(i + 1));
            }
            t.add(1);
            res.add(t);
            n1++;
        }

        if(n1 != numRows){
            int n = (n1 % 2 == 0) ? n1/2 : n1/2 + 1;
            pascal(n1, n, numRows, res);
        }


    }


}
