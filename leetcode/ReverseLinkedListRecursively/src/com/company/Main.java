package com.company;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;


//  Reverse Linked List
//          Solution
//          Reverse a singly linked list.
//
//          Example:
//
//          Input: 1->2->3->4->5->NULL
//          Output: 5->4->3->2->1->NULL
//          Follow up:
//
//          A linked list can be reversed either iteratively or recursively. Could you implement both?


public class Main {


    public static void main(String[] args) {


        //Build test structure
        ListNode head= new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        reverseList(head);

    }




    public static ListNode reverseList(ListNode head) {

        //Check edge cases
        if (head == null || head.next == null) return head;
        //create the new head(p) and continue to the last  node
        ListNode p = reverseList(head.next);
        //going backwards change the value of head so it will point to itself. Inadvertently affecting the new start p.
        head.next.next = head;
        //Now free the initial connection to break the infinite loop
        head.next = null;
        return p;


    }




    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


}
