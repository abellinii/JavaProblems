package com.company;
import java.util.Stack;




public class Main {


    public static void main(String[] args) {
        String a ="11";
        String b ="1";

        addBinary(a,b);
    }

    public String addBinary(String a, String b) {
        int lenA= a.length()-1;
        int lenB= b.length()-1;
        int carry = 0;
        StringBuilder result = new StringBuilder();



        while(lenA >= 0 || lenB >= 0){
            int sum = carry;
            if(lenA >= 0)sum += a.charAt(lenA--) -'0';
            if(lenB >= 0)sum += b.charAt(lenB--) -'0';
            result.insert(0,Integer.toString(sum % 2));
            carry = sum / 2;

        }
        if(carry != 0){
            result.insert(0,carry);
        }

        return result.toString();
    }

}
