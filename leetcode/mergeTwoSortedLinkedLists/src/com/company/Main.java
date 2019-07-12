package com.company;

//
//Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
//
//        Example:
//
//        Input: 1->2->4, 1->3->4
//        Output: 1->1->2->3->4->4

public class Main {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(-6);
        l1.next = new ListNode(-5);
        l1.next.next = new ListNode(6);
        l1.next.next.next = new ListNode(6);
        l1.next.next.next.next = new ListNode(7);

        ListNode l2 = new ListNode(0);


        mergeTwoLists(l1,l2);


    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


        public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

            if(l1 == null) return l2;  //Edge case: either list is empty
            if(l2 == null) return l1;
            ListNode head = l1.val < l2.val ? new ListNode(l1.val): new ListNode(l2.val); // set head with lowest val
            ListNode curr = head; // keep track of current node


            while(l1 != null || l2 != null){

                if(l1 == null){

                    curr.next = new ListNode(l2.val);                  //either one is null add other val
                    l2 = l2.next != null ? l2.next : null;


                }else if(l2 == null){

                    curr.next = new ListNode(l1.val);
                    l1 = l1.next != null ? l1.next : null;

                }else if(l2.val < l1.val || l2.val == curr.val){      //compare each and take lowest

                    curr.next = new ListNode(l2.val);
                    l2 = l2.next != null ? l2.next : null;

                }else{

                    curr.next = new ListNode(l1.val);
                    l1 = l1.next != null ? l1.next : null;

                }


                curr = curr.next;




            }

            return head.next;
        }
}
