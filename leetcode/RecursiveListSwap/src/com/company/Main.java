package com.company;
import java.util.List;
import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {

        ListNode head = new ListNode(5);
        head.next = new ListNode(10);
        head.next.next = new ListNode(20);



        SwapPairs(head);
    }



    public static ListNode SwapPairs(ListNode head) {

        return swap(head,null);

    }

    public static ListNode swap(ListNode head,ListNode returnHead){
        if(returnHead == null) returnHead = head.next;

        ListNode temp = new ListNode(head.val);
        head.val = head.next.val;
        head.next.val = temp.val;
        if(head.next.next != null && head.next.next.next != null){

            swap(head.next.next,returnHead);
        }

        return returnHead;
    }

    //Definition for singly-linked list.
    public static class ListNode {
        public int val;
        public ListNode next;
        public ListNode(int x) { val = x; }
    }


}