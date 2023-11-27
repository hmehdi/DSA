package com.company.al.easy;

import com.company.al.model.ListNode;

public class DeleteDuplicatesListNode {


    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }


    public static void main(String... args){

        //  [1,1,2,3,3]
        ListNode list1 = new ListNode(1, new ListNode(1, new ListNode(2,new ListNode(3,new ListNode(3)))));

        System.out.println(new DeleteDuplicatesListNode().deleteDuplicates(list1));
    }
}
