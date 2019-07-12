package com.company;
import java.util.Stack;

//
//Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//
//        An input string is valid if:
//
//        Open brackets must be closed by the same type of brackets.
//        Open brackets must be closed in the correct order.
//        Note that an empty string is also considered valid.
//
//        Example 1:
//
//        Input: "()"
//        Output: true
//        Example 2:
//
//        Input: "()[]{}"
//        Output: true
//        Example 3:
//
//        Input: "(]"
//        Output: false
//        Example 4:
//
//        Input: "([)]"
//        Output: false
//        Example 5:
//
//        Input: "{[]}"
//        Output: true




public class Main {

    public static void main(String[] args) {

        isValid("{[]}");

    }


    public static boolean isValid(String s) {

        if(s.length() % 2 != 0) return false;                 //Edge case : odd numbers will always be invalid
        Stack<Character> stack = new Stack<Character>();      //Create stack to track leading braces

        for(int i = 0; i < s.length(); i++){                  //loop through pushing if its opening and poping if its closing
            char strC = s.charAt(i);
            char stC = (!stack.empty()) ? stack.peek(): 'a' ;
            if(strC == '{'||strC =='['||strC =='('){
                stack.push(s.charAt(i));

            }else if((stC == '{' && strC == '}') || (stC == '[' && strC == ']') || (stC == '(' && strC == ')')){

                stack.pop();
            }
        }

        return (stack.empty()) ?  true : false;             //if the stack is empty then it is is valid
    }
}
